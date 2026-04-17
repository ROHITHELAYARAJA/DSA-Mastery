# 1781. Sum of Beauty of All Substrings

## Problem Description

The beauty of a string is defined as the difference between the frequency of the most frequent character and the least frequent character (excluding characters with zero frequency).

For example, the beauty of the string `"abaacc"` is:

3 − 1 = 2

Given a string `s`, return the **sum of beauty values of all substrings** of `s`.

---

## Examples

### Example 1
Input:
s = "aabcb"

Output:
5

Explanation:
The substrings with non-zero beauty are:
["aab", "aabc", "aabcb", "abcb", "bcb"]

Each substring has beauty = 1.

---

### Example 2
Input:
s = "aabcbaa"

Output:
17

---

## Constraints

- 1 ≤ s.length ≤ 500  
- s consists only of lowercase English letters.