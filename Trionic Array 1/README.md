# 🚀 3637. Trionic Array I

<div align="center">
  <img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge" alt="Difficulty: Easy" />
  <img src="https://img.shields.io/badge/Topics-Array-blue?style=for-the-badge" alt="Topics: Array" />
</div>

---

## 📝 Problem Description
You are given an integer array `nums` of length `n`. An array is **trionic** if there exist indices $0 < p < q < n - 1$ such that:
* **Segment 1:** `nums[0...p]` is **strictly** increasing.
* **Segment 2:** `nums[p...q]` is **strictly** decreasing.
* **Segment 3:** `nums[q...n - 1]` is **strictly** increasing.

Return `true` if `nums` is trionic, otherwise return `false`.

---

## 💡 Examples

### Example 1
**Input:** `nums = [1,3,5,4,2,6]`  
**Output:** `true`  
**Explanation:** * Pick $p = 2$ and $q = 4$.
* `nums[0...2] = [1, 3, 5]` is strictly increasing ($1 < 3 < 5$).
* `nums[2...4] = [5, 4, 2]` is strictly decreasing ($5 > 4 > 2$).
* `nums[4...5] = [2, 6]` is strictly increasing ($2 < 6$).

### Example 2
**Input:** `nums = [2,1,3]`  
**Output:** `false`  
**Explanation:** There is no way to pick $p$ and $q$ to form the required three segments.

---

## ⚙️ Constraints
* `3 <= n <= 100`
* `-1000 <= nums[i] <= 1000`

---

## 💻 Implementation Idea
To solve this, we can use a **single-pass linear scan**:
1.  **Find the first peak ($p$):** Move as long as the array is strictly increasing. If we never move or hit the end, it's not trionic.
2.  **Find the valley ($q$):** From $p$, move as long as the array is strictly decreasing. If we don't move or hit the end, it's not trionic.
3.  **Check final climb:** From $q$, move as long as the array is strictly increasing. If we reach the end of the array, return `true`.

---

<div align="center">
  <sub>Repository: <b>C:\Users\erohi\OneDrive\Desktop\Git-Code</b></sub>
</div>
