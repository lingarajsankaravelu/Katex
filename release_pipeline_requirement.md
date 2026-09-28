# Release Pipeline Requirements — one-time setup

Four secrets `release.yml` needs before it can run, what each one is for, exactly how to get it, and
where to put it. All four are manual, one-time steps on your end — none of this can be automated or done
on your behalf, since they involve your personal Sonatype account and a private key only you should hold.

Context on *why* each of these exists (not just how to get it) is in `maven-central-release-plan.md` §1 —
short version: GitHub OAuth only proved your identity in the browser and auto-verified your namespace; it
doesn't give a headless CI job anything to authenticate with, and it has nothing to do with artifact
signing, which is a separate, older Maven Central requirement.

## 1. `MAVEN_CENTRAL_USERNAME` + `MAVEN_CENTRAL_PASSWORD`

What: a "user token" — a username/password-shaped API credential for the Central Portal's upload API.
**Not** your real Sonatype login — a separate, revocable credential meant for scripts/CI.

How to get it:
1. Go to https://central.sonatype.com and make sure you're signed in (the GitHub OAuth sign-in you already
   did).
2. Click your account/avatar → **View Account** (or **Account** in the left nav).
3. Find **Generate User Token**. Click it.
4. It shows a token as an XML/properties snippet with two values — something like:
   ```xml
   <server>
     <id>central</id>
     <username>AbCdEfGh</username>
     <password>ij12KlMnOpQrStUv</password>
   </server>
   ```
   The `username` value → `MAVEN_CENTRAL_USERNAME`. The `password` value → `MAVEN_CENTRAL_PASSWORD`.
5. **Copy both now** — the portal will not show the password again after you navigate away. If you lose
   it, revoke and regenerate a new token from the same page.

## 2. `GPG_PRIVATE_KEY` + `GPG_KEY_PASSWORD`

What: a PGP/GPG keypair used to sign every artifact (the `.aar`, the `.pom`, the sources/javadoc jars).
`GPG_KEY_PASSWORD` is the passphrase you set when creating the key; `GPG_PRIVATE_KEY` is the private key
itself, exported as ASCII-armored text so it can be pasted into a GitHub secret.

How to get it (run locally, in a terminal — needs `gpg`, which ships with macOS via Homebrew:
`brew install gnupg` if you don't already have it):

1. Generate a new keypair:
   ```
   gpg --full-generate-key
   ```
   - Key type: accept the default (RSA and RSA).
   - Key size: `4096`.
   - Expiry: your call — `2y` (2 years) is a reasonable default; you'll need to rotate it when it expires.
   - Name/email: use your real name and an email you control (this becomes part of the key's public
     identity; it does not need to match the redacted `developerEmail` placeholders that were in the old
     dead Bintray config).
   - **Passphrase**: set one and remember it — this is `GPG_KEY_PASSWORD`.

2. List your new key to get its ID:
   ```
   gpg --list-secret-keys --keyid-format=long
   ```
   Look for a line like `sec   rsa4096/ABCD1234EFGH5678 2026-09-28 [SC]` — `ABCD1234EFGH5678` is the key ID.

3. **Publish the public key** to a keyserver — Maven Central validates signatures against public
   keyservers, so this step is required, not optional:
   ```
   gpg --keyserver keyserver.ubuntu.com --send-keys ABCD1234EFGH5678
   ```
   (Also fine to additionally push to `keys.openpgp.org` if you want broader propagation, but Ubuntu's
   keyserver alone is sufficient for Central's validation.)

4. Export the **private** key, ASCII-armored, for the GitHub secret:
   ```
   gpg --export-secret-keys --armor ABCD1234EFGH5678 > private-key.asc
   ```
   Open `private-key.asc` in a text editor — its full contents (including the
   `-----BEGIN PGP PRIVATE KEY BLOCK-----` / `-----END PGP PRIVATE KEY BLOCK-----` lines) is the value for
   `GPG_PRIVATE_KEY`.

5. **Delete the exported file after pasting it into GitHub** (`rm private-key.asc`) — it's your private key
   sitting in plaintext on disk otherwise. Don't commit it, don't leave it in Downloads.

## 3. Create the `maven-central-release` environment and add the secrets

`release.yml` targets `environment: maven-central-release`, which is what scopes these four secrets so
only this one workflow can read them (a PR build, for instance, never can) and lets you add a required
manual approval before the publish job runs.

1. On GitHub: repo → **Settings** → **Environments** → **New environment**.
2. Name it exactly `maven-central-release` (must match `release.yml`).
3. Optional but recommended: under **Deployment protection rules**, check **Required reviewers** and add
   yourself — this makes every release run pause for your manual click before it publishes, a last
   checkpoint before an action that can't be undone.
4. Under **Environment secrets**, add all four, one at a time (**Add secret**, paste the value, no quotes,
   no trailing newline needed — GitHub handles that):
   - `MAVEN_CENTRAL_USERNAME`
   - `MAVEN_CENTRAL_PASSWORD`
   - `GPG_PRIVATE_KEY`
   - `GPG_KEY_PASSWORD`

## Checklist

- [x] Central Portal user token generated → `MAVEN_CENTRAL_USERNAME` / `MAVEN_CENTRAL_PASSWORD` captured
- [x] GPG keypair generated, public key pushed to a keyserver
- [x] `GPG_PRIVATE_KEY` exported and `GPG_KEY_PASSWORD` noted
- [ ] Exported private-key file deleted from disk (confirm locally — not verifiable from here)
- [x] `maven-central-release` environment created in repo settings
- [ ] Required reviewer added (optional, recommended)
- [x] All four secrets added to that environment

Once all four are in place, `release.yml` (Actions tab → **Release katexmathview to Maven Central** →
**Run workflow**) is ready to use.
