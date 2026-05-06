# Meridian Plat Kube Hub Walkthrough

This note is the quickest way to read the extra review model in `meridian-plat-kube-hub`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 196 | ship |
| stress | quota pressure | 117 | watch |
| edge | route drift | 136 | watch |
| recovery | secret scope | 173 | ship |
| stale | rollout width | 136 | watch |

Start with `baseline` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`baseline` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
