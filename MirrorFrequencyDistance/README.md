# 3889. Mirror Frequency Distance 🪞

<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />

## 📝 Problem Description

You are given a string `s` consisting of lowercase English letters and digits. For each character, its **mirror character** is defined by reversing the order of its character set:

* **For letters:** The mirror of a character is the letter at the same position from the end of the alphabet (e.g., 'a' ↔ 'z', 'b' ↔ 'y').
* **For digits:** The mirror of a character is the digit at the same position from the end of the range '0' to '9' (e.g., '0' ↔ '9', '1' ↔ '8').

For each **unique** character `c` in the string:
1. Let `m` be its mirror character.
2. Let `freq(x)` denote the number of times character `x` appears in the string.
3. Compute the **absolute difference** between their frequencies: `|freq(c) - freq(m)|`.

The mirror pairs `(c, m)` and `(m, c)` are the same and must be counted **only once**.

Return an integer denoting the total sum of these values over all such distinct mirror pairs.

---

## 📥 Input & Output

**Example 1:**
* **Input:** `s = "ab1z9"`
* **Output:** `3`
* **Explanation:** | Character (c) | Mirror (m) | freq(c) | freq(m) | \|freq(c) - freq(m)\| |
    | :--- | :--- | :--- | :--- | :--- |
    | a | z | 1 | 1 | 0 |
    | b | y | 1 | 0 | 1 |
    | 1 | 8 | 1 | 0 | 1 |
    | 9 | 0 | 1 | 0 | 1 |
    * **Total Sum:** 0 + 1 + 1 + 1 = 3.

**Example 2:**
* **Input:** `s = "4m7n"`
* **Output:** `2`
* **Explanation:** Pairs are (4,5), (m,n), and (7,2). Differences are 1, 0, and 1 respectively. Total = 2.

**Example 3:**
* **Input:** `s = "byby"`
* **Output:** `0`
* **Explanation:** Only pair is (b,y). Both have frequency 2. |2 - 2| = 0.

---

## ⚙️ Constraints

* `1 <= s.length <= 5 * 10^5`
* `s` consists only of lowercase English letters and digits.