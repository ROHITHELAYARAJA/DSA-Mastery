# [7. Reverse Integer](https://leetcode.com/problems/reverse-integer) 🔄

<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />

## 📝 Problem Description

Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range $[-2^{31}, 2^{31} - 1]$, then return `0`.

**Notice:** Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

---

## 💡 Example 1

**Input:** `x = 123`  
**Output:** `321`  
**Explanation:**

| Step | Operation | Resulting Digit | Reversed Value |
| :--- | :--- | :--- | :--- |
| 1 | 123 % 10 | 3 | 3 |
| 2 | 12 % 10 | 2 | 32 |
| 3 | 1 % 10 | 1 | 321 |

## 💡 Example 2

**Input:** `x = -123`  
**Output:** `-321`  
**Explanation:** The negative sign is preserved while the digits are reversed.

## 💡 Example 3

**Input:** `x = 120`  
**Output:** `21`  
**Explanation:** Reversing `120` gives `021`, which leading zeros are ignored, resulting in `21`.

---

## ⚙️ Constraints

* $-2^{31} \le x \le 2^{31} - 1$
* The result must fit within a **32-bit signed integer** range. If it overflows, return `0`.

---

## 🛠️ Logic Note
Since we cannot use 64-bit integers, we must check for overflow **before** multiplying the current reversed number by 10 and adding the next digit..