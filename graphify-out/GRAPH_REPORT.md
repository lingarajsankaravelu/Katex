# Graph Report - StudioProjects  (2026-10-07)

## Corpus Check
- Corpus is ~24,094 words - fits in a single context window. You may not need a graph.

## Summary
- 402 nodes · 743 edges · 49 communities (15 shown, 28 thin omitted)
- Extraction: 93% EXTRACTED · 7% INFERRED · 0% AMBIGUOUS · INFERRED: 51 edges (avg confidence: 0.84)
- Token cost: 405,518 input · 0 output

## Community Hubs (Navigation)
- jQuery Minified Bundle
- KaTeX Parser Internals
- MathView Test Harness
- KaTeX Range/Env Nodes
- KaTeX Fraction Rendering
- Math View List Adapter
- Backlog & CI Pipeline
- KaTeX Core Entry Points
- Runtime MathView Addition
- KaTeX MathML Builder
- Main Activity Screen
- KaTeX Node Attributes
- KaTeX Markup Conversion
- KaTeX Group Begin/End
- KaTeX Markup Width Nodes
- MathView In-Layout Activity
- KaTeX Class Attribute Nodes
- KaTeX Node Markup Variant U
- KaTeX Node Markup Variant X
- Gradle Wrapper Script
- KaTeX Node Markup Variant Z
- App Instrumented Test
- App Unit Test
- MathView Espresso Test
- Asset Upgrade Rationale
- Maven Central Namespace Decision
- AndroidX & Build Tooling Plan
- Launcher Icon (hdpi)
- Launcher Icon Round (hdpi)
- Launcher Icon (mdpi)
- Launcher Icon Round (mdpi)
- Launcher Icon (xhdpi)
- Launcher Icon Round (xhdpi)
- Launcher Icon (xxhdpi)
- Launcher Icon Round (xxhdpi)
- Launcher Icon (xxxhdpi)
- Launcher Icon Round (xxxhdpi)
- Project Backlog Doc
- Backlog: Font Mismatch
- Backlog: Redundant Load Data
- Backlog: XML Preview
- Backlog: Gettext i18n
- GitHub Funding Config

## God Nodes (most connected - your core abstractions)
1. `_` - 52 edges
2. `handler()` - 36 edges
3. `MathView` - 30 edges
4. `lo` - 27 edges
5. `no` - 26 edges
6. `Yt` - 18 edges
7. `htmlBuilder()` - 16 edges
8. `an()` - 14 edges
9. `MathListAdapter` - 12 edges
10. `$e()` - 12 edges

## Surprising Connections (you probably didn't know these)
- `handler()` --indirect_call--> `m()`  [INFERRED]
  Katex/katexmathview/src/main/assets/katex/katex.min.js → Katex/katexmathview/src/main/assets/jquery.min.js
- `w()` --indirect_call--> `c()`  [INFERRED]
  Katex/katexmathview/src/main/assets/katex/katex.min.js → Katex/katexmathview/src/main/assets/jquery.min.js
- `handler()` --indirect_call--> `c()`  [INFERRED]
  Katex/katexmathview/src/main/assets/katex/katex.min.js → Katex/katexmathview/src/main/assets/jquery.min.js
- `htmlBuilder()` --indirect_call--> `c()`  [INFERRED]
  Katex/katexmathview/src/main/assets/katex/katex.min.js → Katex/katexmathview/src/main/assets/jquery.min.js
- `L()` --indirect_call--> `w()`  [INFERRED]
  Katex/katexmathview/src/main/assets/jquery.min.js → Katex/katexmathview/src/main/assets/katex/katex.min.js

## Import Cycles
- None detected.

## Hyperedges (group relationships)
- **Sequential modernization phases of katexmathview (Phases 1-7)** — katex_plan_androidxmigration, katex_plan_buildtoolingupgrade, katex_plan_codemodernization, katex_plan_kotlinconversion, katex_plan_testingci, katex_plan_distribution, katex_plan_appmodulekotlinconversion [EXTRACTED 1.00]
- **Four secrets plus GitHub Environment powering the Maven Central release workflow** — katex_release_pipeline_requirement_mavensecrets, katex_release_pipeline_requirement_gpgsecrets, katex_release_pipeline_requirement_environmentsetup, github_workflows_release_releaseworkflow [EXTRACTED 1.00]
- **KaTeX/jQuery vendored asset sync system (plan + reusable procedure + living doc)** — katex_katex_asset_upgrade_plan_plan, katex_katex_asset_upgrade_plan_syncprocedure, katexmathview_src_main_assets_claude_vendoredassetsdoc [EXTRACTED 1.00]

## Communities (49 total, 28 thin omitted)

### Community 0 - "jQuery Minified Bundle"
Cohesion: 0.08
Nodes (39): Ae(), B(), Be(), c(), $e(), ee(), F(), fe() (+31 more)

### Community 1 - "KaTeX Parser Internals"
Cohesion: 0.15
Nodes (8): an(), br(), g, handler(), ir(), lo, rn(), sr()

### Community 2 - "MathView Test Harness"
Cohesion: 0.10
Nodes (9): Activity, Bundle, MathViewTestActivity, Context, MotionEvent, MathView, MotionEvent, MathViewTest (+1 more)

### Community 3 - "KaTeX Range/Env Nodes"
Cohesion: 0.12
Nodes (4): en, no, tn, Yn

### Community 4 - "KaTeX Fraction Rendering"
Cohesion: 0.11
Nodes (5): Cn(), f, htmlBuilder(), r, Yt

### Community 5 - "Math View List Adapter"
Cohesion: 0.13
Nodes (18): Adapter, CardClick, AppCompatActivity, Bundle, View, MathViewListActivity, MathListAdapter, ViewHolder (+10 more)

### Community 6 - "Backlog & CI Pipeline"
Cohesion: 0.09
Nodes (25): CI GitHub Actions Workflow (assemble/unit-test/lint), Release katexmathview to Maven Central Workflow, Issue #38: \frac divider not rendering, Issue #39: \begin{tabular} not parsed (upstream limitation), Issue #48/#30: Wrap long equations instead of horizontal scroll, KaTeX Vendored Asset Upgrade Plan, Reusable KaTeX/jQuery asset sync procedure, Two credential pairs needed for Maven Central publishing (portal user token + GPG key) (+17 more)

### Community 7 - "KaTeX Core Entry Points"
Cohesion: 0.16
Nodes (7): _, ar(), ee(), ln(), or(), sn(), T()

### Community 8 - "Runtime MathView Addition"
Cohesion: 0.30
Nodes (7): AppCompatActivity, Bundle, MathViewAdditionAtRuntime, getScrollableData(), getRandomColor(), Context, LinearLayout

### Community 9 - "KaTeX MathML Builder"
Cohesion: 0.18
Nodes (3): It, mathmlBuilder(), qt

### Community 10 - "Main Activity Screen"
Cohesion: 0.36
Nodes (4): AppCompatActivity, Bundle, View, MainActivity

### Community 11 - "KaTeX Node Attributes"
Cohesion: 0.33
Nodes (3): Bt, Gt(), Lt()

### Community 14 - "KaTeX Markup Width Nodes"
Cohesion: 0.29
Nodes (3): At(), Tt(), W

### Community 15 - "MathView In-Layout Activity"
Cohesion: 0.60
Nodes (3): AppCompatActivity, Bundle, MathviewInLayoutActivity

### Community 19 - "Gradle Wrapper Script"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **27 isolated node(s):** `FUNDING.yml Sponsorship Config`, `Maven Central Setup/Dependency Section`, `Open Issues Backlog (post v2.0.0)`, `Issue #53/#34: Read formula text back from MathView`, `Issue #48/#30: Wrap long equations instead of horizontal scroll` (+22 more)
  These have ≤1 connection - possible missing edges or undocumented components. (Counts symbols only; 121 node(s) total have ≤1 connection when file, concept and rationale nodes are included.)
- **28 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `_` connect `KaTeX Core Entry Points` to `jQuery Minified Bundle`, `KaTeX Parser Internals`, `KaTeX Range/Env Nodes`, `KaTeX Fraction Rendering`, `KaTeX MathML Builder`, `KaTeX Node Attributes`, `KaTeX Markup Conversion`, `KaTeX Group Begin/End`, `KaTeX Markup Width Nodes`, `KaTeX Class Attribute Nodes`, `KaTeX Node Markup Variant U`, `KaTeX Node Markup Variant X`, `KaTeX Node Markup Variant Z`?**
  _High betweenness centrality (0.220) - this node is a cross-community bridge._
- **Why does `handler()` connect `KaTeX Parser Internals` to `jQuery Minified Bundle`, `KaTeX Range/Env Nodes`, `KaTeX Core Entry Points`?**
  _High betweenness centrality (0.075) - this node is a cross-community bridge._
- **Why does `no` connect `KaTeX Range/Env Nodes` to `KaTeX Parser Internals`, `KaTeX Core Entry Points`?**
  _High betweenness centrality (0.038) - this node is a cross-community bridge._
- **Are the 5 inferred relationships involving `handler()` (e.g. with `c()` and `m()`) actually correct?**
  _`handler()` has 5 INFERRED edges - model-reasoned connections that need verification._
- **Are the 9 inferred relationships involving `MathView` (e.g. with `.`attributes constructor applies setClickable from XML`()` and `.`attributes constructor applies setText and setTextColor from XML`()`) actually correct?**
  _`MathView` has 9 INFERRED edges - model-reasoned connections that need verification._
- **What connects `FUNDING.yml Sponsorship Config`, `Maven Central Setup/Dependency Section`, `Open Issues Backlog (post v2.0.0)` to the rest of the system?**
  _27 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `jQuery Minified Bundle` be split into smaller, more focused modules?**
  _Cohesion score 0.07987012987012987 - nodes in this community are weakly interconnected._