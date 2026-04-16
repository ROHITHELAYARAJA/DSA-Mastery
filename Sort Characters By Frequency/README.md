# 451. Sort Characters By Frequency

## Problem Statement

Given a string `s`, sort it in decreasing order based on the frequency of the characters.

The **frequency** of a character is the number of times it appears in the string.

Return the sorted string.  
If there are multiple valid answers, return **any** of them.

---

## Examples

### Example 1
**Input:**  
`s = "tree"`

**Output:**  
`"eert"`

**Explanation:**  
Character `'e'` appears twice, while `'r'` and `'t'` appear once.  
So `'e'` must come before both `'r'` and `'t'`.  
`"eetr"` is also a valid answer.

---

### Example 2
**Input:**  
`s = "cccaaa"`

**Output:**  
`"aaaccc"`

**Explanation:**  
Both `'c'` and `'a'` appear three times, so `"cccaaa"` and `"aaaccc"` are valid.  
`"cacaca"` is invalid because identical characters must be grouped together.

---

### Example 3
**Input:**  
`s = "Aabb"`

**Output:**  
`"bbAa"`

**Explanation:**  
`"bbaA"` is also valid.  
`'A'` and `'a'` are considered different characters.

---

## Constraints

- `1 <= s.length <= 5 * 10^5`
- `s` consists of uppercase and lowercase English letters and digits.