# [3889. Mirror Frequency Distance](https://leetcode.com/problems/mirror-frequency-distance) 🪞

<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />

## 📝 Problem Description

You are given a string `s` consisting of lowercase English letters and digits. For each character, its **mirror character** is defined by reversing the order of its character set:

* **Letters:** 'a' ↔ 'z', 'b' ↔ 'y', etc.
* **Digits:** '0' ↔ '9', '1' ↔ '8', etc.

Find the sum of absolute differences in frequencies for all distinct mirror pairs.

---

## 💡 Example 1

**Input:** `s = "ab1z9"`  
**Output:** `3`  
**Explanation:**

| Character (c) | Mirror (m) | freq(c) | freq(m) | \|freq(c) - freq(m)\| |
| :--- | :--- | :--- | :--- | :--- |
| a | z | 1 | 1 | 0 |
| b | y | 1 | 0 | 1 |
| 1 | 8 | 1 | 0 | 1 |
| 9 | 0 | 1 | 0 | 1 |

**Total Sum:** $0 + 1 + 1 + 1 = 3$

---

## ⚙️ Constraints

* `1 <= s.length <= 5 * 10⁵`
* `s` consists only of lowercase English letters and digits.
