# [8. String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi) 🔢

<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />

## 📝 Problem Description

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer. The algorithm follows these steps:

1.  **Whitespace:** Ignore any leading whitespace (`" "`).
2.  **Signedness:** Determine the sign by checking if the next character is `'-'` or `'+'`. Assume positive if neither is present.
3.  **Conversion:** Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, the result is `0`.
4.  **Rounding:** If the integer is out of the 32-bit signed integer range $[-2^{31}, 2^{31} - 1]$, round it to stay within the range.

---

## 💡 Examples

**Example 1:**
* **Input:** `s = "42"`
* **Output:** `42`
* **Explanation:** No leading whitespace or signs. "42" is read.

**Example 2:**
* **Input:** `s = "   -042"`
* **Output:** `-42`
* **Explanation:** Leading whitespace ignored → '-' read (negative) → "042" read (zeros ignored) → `-42`.

**Example 3:**
* **Input:** `s = "1337c0d3"`
* **Output:** `1337`
* **Explanation:** Reads "1337" and stops at 'c' (non-digit).

**Example 4:**
* **Input:** `s = "0-1"`
* **Output:** `0`
* **Explanation:** Reads "0" and stops at '-' (non-digit).

**Example 5:**
* **Input:** `s = "words and 987"`
* **Output:** `0`
* **Explanation:** Reading stops immediately at 'w'.

---

## 📊 Step-by-Step Logic

| Step | Action | Example: `"  -42abc"` | Resulting State |
| :--- | :--- | :--- | :--- |
| **1** | Trim Whitespace | `"  -42abc"` → `"-42abc"` | `index = 2` |
| **2** | Handle Sign | `"-"` found | `sign = -1` |
| **3** | Collect Digits | `"4", "2"` | `value = 42` |
| **4** | Stop at Non-digit | `"a"` encountered | **Stop** |
| **5** | Apply Sign & Clamp | `-1 * 42` | `-42` |

---

## ⚙️ Constraints

* `0 <= s.length <= 200`
* `s` consists of English letters, digits, `' '`, `'+'`, `'-'`, and `'.'`.
* Result must be clamped within **$[-2^{31}, 2^{31} - 1]$**.

---

## 🛠️ Implementation Edge Cases
* **Empty String:** Should return `0`.
* **Only Signs/Space:** `"+ "`, `"  -"` should return `0`.
* **Overflow:** `"91283472332"` should return `2147483647` (INT_MAX).
* **Underflow:** `"-91283472332"` should return `-2147483648` (INT_MIN).