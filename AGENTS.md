## Project Overview

Katex is an Android library (`katexmathview` module) that renders LaTeX/KaTeX math inside a WebView-based custom view (`MathView`). The `app` module is a demo app showing three usage patterns: XML layout, runtime addition, and a RecyclerView list. Published to Maven Central as `io.github.lingarajsankaravelu:katexmathview`. Two Gradle modules are declared in `settings.gradle`: `:app` and `:katexmathview`.

## Folder Structure

```
Katex/
├── app/                        — demo app module
│   └── src/main/kotlin/hourglass/github/in/katex/
│       ├── activities/         — MainActivity, MathViewListActivity, MathViewAdditionAtRuntime, MathviewInLayoutActivity
│       ├── adapters/           — MathListAdapter (RecyclerView)
│       ├── DataHelpers.kt, Helpers.kt
├── katexmathview/              — the published library module
│   └── src/main/
│       ├── kotlin/katex/hourglass/in/mathlib/MathView.kt  — the core WebView-based component
│       └── assets/             — vendored katex.min.js, jquery.min.js (see CLAUDE.md inside for sync rules)
├── graphify-out/                — knowledge graph (see ## graphify below)
├── README.md                    — usage docs (XML attrs, runtime API, accepted LaTeX input formats)
├── build.gradle, settings.gradle, gradle/libs.versions.toml  — Gradle build config (2 modules: app, katexmathview)
└── .github/workflows/          — build.yml (CI), release.yml (Maven Central publish)
```

## graphify

This project has a knowledge graph at graphify-out/ with god nodes, community structure, and cross-file relationships.

Rules:
- For codebase questions, first run `graphify query "<question>"` when graphify-out/graph.json exists. Use `graphify path "<A>" "<B>"` for relationships and `graphify explain "<concept>"` for focused concepts. These return a scoped subgraph, usually much smaller than GRAPH_REPORT.md or raw grep output.
- If graphify-out/wiki/index.md exists, use it for broad navigation instead of raw source browsing.
- Read graphify-out/GRAPH_REPORT.md only for broad architecture review or when query/path/explain do not surface enough context.
- After modifying code, run `graphify update .` to keep the graph current (AST-only, no API cost).
