# Vendored assets: KaTeX + jQuery + project glue

This directory is bundled into the `katexmathview` AAR and loaded straight into a
`WebView` (see `MathView.kt`'s `getOfflineKatexConfig()`, the only place that references
these files). It is not fetched at runtime — it ships with the library.

**This file is NOT shipped.** `katexmathview/build.gradle` excludes it from asset
packaging via `android.androidResources.ignoreAssetsPattern` (verified by inspecting a
built AAR — see "Verifying the exclusion" below). If you ever restructure that exclusion,
re-verify it before releasing, or this file (and anything else matched by the same
pattern) will end up inside the published AAR/APK.

## Current versions

- KaTeX: **0.18.9** (also recorded in `katex/VERSION`)
- jQuery: **3.7.1**

Last synced: 2026-09-28, after ~6 years vendored at KaTeX 0.10.11 / jQuery 3.4.1.

## What's actually referenced by the WebView

Only these are loaded by `MathView.kt`'s HTML template — everything else in this
directory is dead weight and has been deliberately pruned:

| File                                            | Loaded?                              |
| ----------------------------------------------- | ------------------------------------ |
| `katex/katex.min.js`, `katex/katex.min.css` | yes                                  |
| `katex/contrib/auto-render.min.js`            | yes                                  |
| `katex/fonts/*`                               | yes (via CSS`@font-face`)          |
| `jquery.min.js`                               | yes                                  |
| `latex_parser.js`                             | yes — project-owned, not from KaTeX |
| `webviewstyle.css`, `themes/style.css`      | yes                                  |

Deliberately **not** vendored (present in upstream `dist/` but never loaded, so don't
re-add without also adding a `<script>`/`<link>` tag for them): `katex.js`, `katex.mjs`,
`katex.css` (non-minified/ESM variants), `contrib/auto-render.mjs`, `contrib/copy-tex.*`
(clipboard support), `contrib/mathtex-script-type.*`, `contrib/mhchem.*` (chemistry
notation — 3000+ lines), `katex/README.md`. If a feature actually needs one of these,
add it back deliberately with its own script tag — don't restore the whole `dist/` blindly.

## The one behavioral customization

Upstream KaTeX's `auto-render` disables the bare `$...$` delimiter by default (it
"ruins the display of normal `$` in text"). This project relies on `$...$` working,
because `latex_parser.js` wraps `.latexEle[data-latex]` elements in `$...$`.

That used to be a hand-patched copy of `auto-render.js` sitting in this tree (loaded
redundantly after the stock `.min.js`). **It's no longer a vendor patch.** As of the
2026-09-28 sync, `latex_parser.js` passes the delimiters explicitly to
`renderMathInElement(document.body, { delimiters: [...] })`, including the `$...$` pair.
This means:

- Only the stock `katex/contrib/auto-render.min.js` is vendored/loaded — no hand-patched
  non-minified copy exists anymore.
- **Do not revert `latex_parser.js`'s explicit `delimiters` option** — if you do, `$...$`
  silently stops rendering, because upstream's default no longer includes it.

## Reusable sync procedure (do this instead of ad-hoc copying)

1. `npm view katex version` — confirm the target version deliberately (don't blindly
   chase `latest` for a rendering library with visual output; check the KaTeX changelog
   for breaking changes first).
2. In a scratch dir (not this repo): `npm pack katex@<version>` and
   `npm pack jquery@<version>`, then extract each into **separate** directories —
   both packages' tarballs use a top-level `package/` folder, so extracting them into
   the same place silently merges/overwrites one with the other.
3. From the extracted KaTeX `package/dist/`, copy into `katex/`:
   - `katex.min.js` → `katex/katex.min.js`
   - `katex.min.css` → `katex/katex.min.css`
   - `fonts/` → `katex/fonts/` (delete-and-replace wholesale — font filenames/hashes
     can change between releases even if they happened not to this time)
   - `contrib/auto-render.min.js` → `katex/contrib/auto-render.min.js`
4. From the extracted jQuery `package/dist/`, copy `jquery.min.js` → `jquery.min.js`
   (one level up, not inside `katex/`).
5. Update `katex/VERSION` to the new version string.
6. Delete anything under `katex/` that step 3 didn't just write — catches
   renamed/removed upstream files and keeps the pruning above from regressing.
7. Leave `latex_parser.js`, `webviewstyle.css`, `themes/style.css` untouched — none of
   them come from the KaTeX or jQuery packages.
8. Build and test:
   ```
   ./gradlew clean assembleDebug assembleDebugAndroidTest testDebugUnitTest lintDebug --console=plain
   ```
9. **Manually** smoke-test rendering in the sample app (`MathViewListActivity` /
   `MathviewInLayoutActivity`), covering: inline `$...$`, block `$$...$$`, `\(...\)`,
   `\[...\]`, and at least one formula that exercises `latex_parser.js`'s
   matrix/bracket/line-break splitting. None of this is covered by the Gradle unit/lint
   pipeline since it's WebView JS rendering — the Espresso test
   (`MathViewEspressoTest.kt`) only checks that *something* with class `katex` renders,
   not that specific delimiter/formula syntax works.

## Verifying the exclusion of this file

If you touch the `ignoreAssetsPattern` config in `katexmathview/build.gradle`, re-verify
this file doesn't leak into a release artifact:

```
./gradlew :katexmathview:assembleRelease
unzip -l katexmathview/build/outputs/aar/katexmathview-release.aar | grep -i claude.md
```

The `grep` should find nothing. If it finds `CLAUDE.md`, fix the exclusion before
publishing — don't just delete this file as a workaround, since the next sync will
recreate the same risk.
