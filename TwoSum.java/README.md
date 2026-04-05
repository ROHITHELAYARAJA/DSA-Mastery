# [1. Two Sum](https://leetcode.com/problems/two-sum) 🎯

<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />

## 📝 Problem Description

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

* You may assume that each input would have **exactly one solution**.
* You may not use the *same* element twice.
* You can return the answer in any order.

---

## 💡 Example 1

**Input:** `nums = [2,7,11,15]`, `target = 9`  
**Output:** `[0,1]`  
**Explanation:**

| Index 1 | Index 2 | nums[i] | nums[j] | Sum | Target |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 0 | 1 | 2 | 7 | 9 | 9 |

**Result:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

## 💡 Example 2

**Input:** `nums = [3,2,4]`, `target = 6`  
**Output:** `[1,2]`  
**Explanation:** * `nums[1] + nums[2] = 2 + 4 = 6`.

## 💡 Example 3

**Input:** `nums = [3,3]`, `target = 6`  
**Output:** `[0,1]`

---

## ⚙️ Constraints

* `2 <= nums.length <= 10⁴`
* `-10⁹ <= nums[i] <= 10⁹`
* `-10⁹ <= target <= 10⁹`
* **Only one valid answer exists.**

---

## 🚀 Follow-up
Can you come up with an algorithm that is less than $O(n^2)$ time complexity?  
*(Hint: Use a Hash Map to achieve $O(n)$ time complexity).*.
