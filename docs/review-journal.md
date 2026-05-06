# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 196, lane `ship`
- `stress`: `quota pressure`, score 117, lane `watch`
- `edge`: `route drift`, score 136, lane `watch`
- `recovery`: `secret scope`, score 173, lane `ship`
- `stale`: `rollout width`, score 136, lane `watch`

## Note

The repository should be understandable without pretending it is larger than it is.
