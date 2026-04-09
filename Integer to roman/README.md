# [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman) 🏛️

<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />

## 📝 Problem Description

Seven different symbols represent Roman numerals with the following values:

| Symbol | Value |
| :----: | ----: |
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

Roman numerals are formed by appending the conversions of decimal place values from **highest to lowest**. The rules are:

- If the value does **not** start with `4` or `9`, select the symbol of the maximal value that can be subtracted from the input, append that symbol, subtract its value, and convert the remainder.
- If the value starts with `4` or `9`, use the **subtractive form** (e.g., `4 = IV`, `9 = IX`).
- Only the following subtractive forms are used: `4 (IV)`, `9 (IX)`, `40 (XL)`, `90 (XC)`, `400 (CD)`, `900 (CM)`.
- Powers of 10 (`I`, `X`, `C`, `M`) can be appended **at most 3 times** consecutively.

Given an integer, convert it to a Roman numeral.

---

## 💡 Example 1

**Input:** `num = 3749`  
**Output:** \"MMMDCCXLIX\"  
**Explanation:**

| Decimal | Roman | Breakdown |
| :------ | :---- | :-------- |
| 3000 | MMM | 1000 (M) + 1000 (M) + 1000 (M) |
| 700 | DCC | 500 (D) + 100 (C) + 100 (C) |
| 40 | XL | 10 (X) less than 50 (L) |
| 9 | IX | 1 (I) less than 10 (X) |

> **Note:** 49 is not `IL` (1 less than 50) — conversion is applied per decimal place.

## 💡 Example 2

**Input:** `num = 58`  
**Output:** \"LVIII\"  
**Explanation:**

| Decimal | Roman |
| :------ | :---- |
| 50 | L |
| 8 | VIII |

## 💡 Example 3

**Input:** `num = 1994`  
**Output:** \"MCMXCIV\"  
**Explanation:**

| Decimal | Roman | Subtractive Form? |
| :------ | :---- | :---------------- |
| 1000 | M | No |
| 900 | CM | Yes (100 less than 1000) |
| 90 | XC | Yes (10 less than 100) |
| 4 | IV | Yes (1 less than 5) |

---

## ⚙️ Constraints

* $1 \le num \le 3999$
* The input is guaranteed to be within the Roman numeral range.

---

## 🛠️ Logic Note

Map all **13 values** (including the 6 subtractive forms) in **descending order**:

| Value | Symbol |
| ----: | :----- |
| 1000 | M |
| 900 | CM |
| 500 | D |
| 400 | CD |
| 100 | C |
| 90 | XC |
| 50 | L |
| 40 | XL |
| 10 | X |
| 9 | IX |
| 5 | V |
| 4 | IV |
| 1 | I |

**Greedy approach:** At each step, find the largest value ≤ `num`, append its symbol, subtract its value, and repeat until `num = 0`. Because subtractive forms are pre-included in the table, no special-case logic is needed — the greedy selection handles them automatically.
