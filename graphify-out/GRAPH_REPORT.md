# Graph Report - Katex  (2026-10-13)

## Corpus Check
- 27 files · ~21,076 words
- Verdict: corpus is large enough that graph structure adds value.
- Unclassified: 87 file(s) not represented in the graph (top: .ttf 20, .woff 20, .woff2 20)

## Summary
- 402 nodes · 747 edges · 49 communities (19 shown, 24 thin omitted)
- Extraction: 94% EXTRACTED · 6% INFERRED · 0% AMBIGUOUS · INFERRED: 47 edges (avg confidence: 0.85)
- Token cost: 0 input · 0 output

## Graph Freshness
- Built from commit: `69f46f0a`
- Run `git rev-parse HEAD` and compare to check if the graph is stale.
- Run `graphify update .` after code changes (no API cost).

## Community Hubs (Navigation)
- jquery.min.js
- handler
- MathView
- no
- Yt
- MathListAdapter
- Phase 6: Distribution (Maven Central)
- Bt
- MathViewAdditionAtRuntime.kt
- _
- MainActivity
- I
- Vendored assets: KaTeX + jQuery + project glue
- W
- .onCreate
- Wn
- j
- U
- X
- task.md
- AGENTS.md
- gradlew
- Phase 3: Code-level modernization of MathView
- Z
- d
- ExampleInstrumentedTest
- ExampleUnitTest
- Maven Central Setup/Dependency Section
- Phase 1: AndroidX Migration
- App Launcher Icon (hdpi)
- App Launcher Icon (Round, hdpi)
- App Launcher Icon (mdpi)
- ic_launcher_round.png (mdpi)
- App Launcher Icon (xhdpi)
- App Launcher Icon (Round, xhdpi)
- ic_launcher.png (xxhdpi)
- App Launcher Icon (Round, xxhdpi)
- App Launcher Icon (xxxhdpi)
- Round Launcher Icon (xxxhdpi)
- MathViewEspressoTest
- en
- FUNDING.yml Sponsorship Config
- KatexMathView Modernization Plan

## God Nodes (most connected - your core abstractions)
1. `_` - 52 edges
2. `MathView` - 37 edges
3. `handler()` - 36 edges
4. `lo` - 27 edges
5. `no` - 26 edges
6. `Yt` - 18 edges
7. `MathViewTest` - 17 edges
8. `htmlBuilder()` - 16 edges
9. `an()` - 14 edges
10. `MathListAdapter` - 12 edges

## Surprising Connections (you probably didn't know these)
- `ViewHolder` --references--> `MathView`  [EXTRACTED]
  app/src/main/kotlin/hourglass/github/in/katex/adapters/MathListAdapter.kt → katexmathview/src/main/kotlin/katex/hourglass/in/mathlib/MathView.kt
- `handler()` --indirect_call--> `m()`  [INFERRED]
  katexmathview/src/main/assets/katex/katex.min.js → katexmathview/src/main/assets/jquery.min.js
- `handler()` --indirect_call--> `c()`  [INFERRED]
  katexmathview/src/main/assets/katex/katex.min.js → katexmathview/src/main/assets/jquery.min.js
- `htmlBuilder()` --indirect_call--> `c()`  [INFERRED]
  katexmathview/src/main/assets/katex/katex.min.js → katexmathview/src/main/assets/jquery.min.js
- `ee()` --indirect_call--> `d()`  [INFERRED]
  katexmathview/src/main/assets/jquery.min.js → katexmathview/src/main/assets/katex/katex.min.js

## Import Cycles
- None detected.

## Hyperedges (group relationships)
- **Sequential modernization phases of katexmathview (Phases 1-7)** — katex_plan_androidxmigration, katex_plan_buildtoolingupgrade, katex_plan_codemodernization, katex_plan_kotlinconversion, katex_plan_testingci, katex_plan_distribution, katex_plan_appmodulekotlinconversion [EXTRACTED 1.00]

## Communities (49 total, 24 thin omitted)

### Community 0 - "jquery.min.js"
Cohesion: 0.08
Nodes (38): Ae(), B(), Be(), c(), $e(), ee(), F(), fe() (+30 more)

### Community 1 - "handler"
Cohesion: 0.18
Nodes (7): an(), br(), handler(), ir(), lo, rn(), sr()

### Community 2 - "MathView"
Cohesion: 0.08
Nodes (9): Activity, Bundle, MathViewTestActivity, Context, MotionEvent, MathView, MotionEvent, MathViewTest (+1 more)

### Community 3 - "no"
Cohesion: 0.14
Nodes (3): no, tn, Yn

### Community 4 - "Yt"
Cohesion: 0.10
Nodes (6): Cn(), f, htmlBuilder(), mathmlBuilder(), r, Yt

### Community 5 - "MathListAdapter"
Cohesion: 0.13
Nodes (18): Adapter, CardClick, AppCompatActivity, Bundle, View, MathViewListActivity, MathListAdapter, ViewHolder (+10 more)

### Community 6 - "Phase 6: Distribution (Maven Central)"
Cohesion: 0.50
Nodes (5): CI GitHub Actions Workflow (assemble/unit-test/lint), Release katexmathview to Maven Central Workflow, Phase 6: Distribution (Maven Central), Phase 5: Testing & CI, KatexMathView README

### Community 7 - "Bt"
Cohesion: 0.19
Nodes (4): Bt, Gt(), It, qt

### Community 8 - "MathViewAdditionAtRuntime.kt"
Cohesion: 0.30
Nodes (7): AppCompatActivity, Bundle, MathViewAdditionAtRuntime, getScrollableData(), getRandomColor(), Context, LinearLayout

### Community 9 - "_"
Cohesion: 0.14
Nodes (8): _, ar(), ee(), ln(), Lt(), or(), sn(), T()

### Community 10 - "MainActivity"
Cohesion: 0.36
Nodes (4): AppCompatActivity, Bundle, View, MainActivity

### Community 12 - "Vendored assets: KaTeX + jQuery + project glue"
Cohesion: 0.29
Nodes (6): Current versions, Reusable sync procedure (do this instead of ad-hoc copying), The one behavioral customization, Vendored assets: KaTeX + jQuery + project glue, Verifying the exclusion of this file, What's actually referenced by the WebView

### Community 13 - "W"
Cohesion: 0.29
Nodes (3): At(), Tt(), W

### Community 14 - ".onCreate"
Cohesion: 0.60
Nodes (3): AppCompatActivity, Bundle, MathviewInLayoutActivity

### Community 19 - "task.md"
Cohesion: 0.40
Nodes (4): Developer Insight:, Execution Worfklow:, Goal:, LLM as a judge

### Community 20 - "AGENTS.md"
Cohesion: 0.50
Nodes (3): Folder Structure, graphify, Project Overview

### Community 21 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

### Community 22 - "Phase 3: Code-level modernization of MathView"
Cohesion: 0.50
Nodes (4): Phase 7: App module Kotlin conversion, Phase 3: Code-level modernization of MathView, Phase 4: Kotlin conversion of katexmathview, WebView file-access hardening considered, deliberately left to platform default (MathView only loads file:///android_asset)

### Community 24 - "d"
Cohesion: 0.33
Nodes (3): d(), g, p()

## Knowledge Gaps
- **29 isolated node(s):** `Project Overview`, `Folder Structure`, `graphify`, `Current versions`, `What's actually referenced by the WebView` (+24 more)
  These have ≤1 connection - possible missing edges or undocumented components. (Counts symbols only; 122 node(s) total have ≤1 connection when file, concept and rationale nodes are included.)
- **24 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `_` connect `_` to `handler`, `no`, `Yt`, `Bt`, `I`, `en`, `W`, `Wn`, `j`, `U`, `X`, `Z`, `d`?**
  _High betweenness centrality (0.220) - this node is a cross-community bridge._
- **Why does `handler()` connect `handler` to `jquery.min.js`, `_`, `no`, `d`?**
  _High betweenness centrality (0.075) - this node is a cross-community bridge._
- **Why does `no` connect `no` to `_`, `handler`?**
  _High betweenness centrality (0.038) - this node is a cross-community bridge._
- **Are the 15 inferred relationships involving `MathView` (e.g. with `.`attributes constructor applies setClickable from XML`()` and `.`attributes constructor applies setText and setTextColor from XML`()`) actually correct?**
  _`MathView` has 15 INFERRED edges - model-reasoned connections that need verification._
- **Are the 5 inferred relationships involving `handler()` (e.g. with `c()` and `m()`) actually correct?**
  _`handler()` has 5 INFERRED edges - model-reasoned connections that need verification._
- **What connects `Project Overview`, `Folder Structure`, `graphify` to the rest of the system?**
  _29 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `jquery.min.js` be split into smaller, more focused modules?**
  _Cohesion score 0.08148148148148149 - nodes in this community are weakly interconnected._