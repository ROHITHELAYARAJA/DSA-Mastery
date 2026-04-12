# 875. Koko Eating Bananas

## Problem Description

Koko loves to eat bananas. There are `n` piles of bananas, and the `i-th` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her eating speed of `k` bananas per hour.

Each hour, she chooses one pile of bananas and eats `k` bananas from that pile.  
If the pile has fewer than `k` bananas, she eats all remaining bananas in that pile and stops eating for that hour.

Koko wants to eat slowly but must finish eating all bananas before the guards return.

Return the **minimum integer `k`** such that she can eat all the bananas within `h` hours.

---

## Examples

### Example 1
**Input**
```
piles = [3,6,7,11]
h = 8
```

**Output**
```
4
```

---

### Example 2
**Input**
```
piles = [30,11,23,4,20]
h = 5
```

**Output**
```
30
```

---

### Example 3
**Input**
```
piles = [30,11,23,4,20]
h = 6
```

**Output**
```
23
```

---

## Constraints

- `1 <= piles.length <= 10^4`
- `piles.length <= h <= 10^9`
- `1 <= piles[i] <= 10^9`