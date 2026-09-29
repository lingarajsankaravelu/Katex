# Backlog

Open issues triaged against the [v2.0.0 release](https://github.com/lingarajsankaravelu/Katex/releases/tag/v_2.0.0) that are **not** fixed yet. Pick these up one at a time.

## Feature requests

- **[#53](https://github.com/lingarajsankaravelu/Katex/issues/53) / [#34](https://github.com/lingarajsankaravelu/Katex/issues/34) — Read formula text back from `MathView`**
  No `getText()`/`getDisplayText()`-style accessor exists. Needs a small public API addition mirroring `TextView.getText()`.

- **[#48](https://github.com/lingarajsankaravelu/Katex/issues/48) / [#30](https://github.com/lingarajsankaravelu/Katex/issues/30) (partial) — Wrap long equations instead of horizontal-scrolling**
  `MathView` currently only scrolls horizontally for overflowing content; no line-wrap option. Note: #30's secondary complaint about `\cancel` not rendering is already fixed as of v2.0.0's KaTeX 0.18.9 bump — only the wrapping ask remains.

- **[#41](https://github.com/lingarajsankaravelu/Katex/issues/41) — Avoid redundant `loadData()` calls**
  Each individual setter (`setTextColor`, `setTextSize`, etc.) triggers its own WebView reload. Worth batching/deferring so multiple setter calls in a row only reload once.

## Bugs / needs investigation

- **[#38](https://github.com/lingarajsankaravelu/Katex/issues/38) — `\frac` divider not rendering**
  Reported against an old KaTeX version; unverified whether it still reproduces on the current KaTeX 0.18.9 bundle. Needs a repro on-device before deciding if it's fixed or still broken.

- **[#52](https://github.com/lingarajsankaravelu/Katex/issues/52) — Blank in Android Studio's XML design-tab preview**
  Likely an inherent limitation of previewing a `WebView` subclass in the layout editor rather than a library bug. Needs confirmation of whether anything can be done (e.g. a `@Preview`-safe fallback) or if this should be closed as won't-fix.

## Upstream / won't-fix candidates

- **[#39](https://github.com/lingarajsankaravelu/Katex/issues/39) — `\begin{tabular}` not parsed**
  Confirmed: KaTeX has no `tabular` environment at all (only `array`/`matrix`-style environments), even in the current 0.18.9 bundle. This is an upstream KaTeX limitation, not a bug in this library — likely candidate to close as won't-fix with an explanation, rather than a fix to implement.
