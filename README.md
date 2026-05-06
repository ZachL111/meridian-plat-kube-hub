# meridian-plat-kube-hub

`meridian-plat-kube-hub` is a compact Java repository for platform engineering, centered on this goal: Package a Java local lab for kube analysis with framed sample traffic, bounds and ordering tests, and documented operating limits.

## Reason For The Project

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Meridian Plat Kube Hub Review Notes

The first comparison I would make is `rollout width` against `quota pressure` because it shows where the rule is most opinionated.

## What It Does

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/meridian-plat-kube-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `rollout width` and `quota pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## How It Is Put Together

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `rollout width`, `quota pressure`, `route drift`, and `secret scope`.

The Java code keeps the review rule close to the tests.

## Run It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Check It

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Boundaries

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
