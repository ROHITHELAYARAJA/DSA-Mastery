# 912. Sort an Array

## 🧩 Problem Description

Given an array of integers `nums`, sort the array in **ascending order** and return it.

You must:

* ❌ Not use any built-in sorting function.
* ✅ Achieve **O(n log n)** time complexity.
* ✅ Use the **minimum possible extra space**.

---

## 📥 Example 1

**Input**

```
nums = [5,2,3,1]
```

**Output**

```
[1,2,3,5]
```

**Explanation**

After sorting, all elements are arranged in increasing order.

---

## 📥 Example 2

**Input**

```
nums = [5,1,1,2,0,0]
```

**Output**

```
[0,0,1,1,2,5]
```

**Explanation**

Array may contain duplicate values.
All elements must still be sorted correctly.

---

## 📌 Constraints

* `1 ≤ nums.length ≤ 5 × 10⁴`
* `-5 × 10⁴ ≤ nums[i] ≤ 5 × 10⁴`

---

## 🎯 Goal

Design an efficient sorting algorithm that:

* Works faster than quadratic algorithms like Bubble Sort or Selection Sort.
* Maintains **O(n log n)** performance.
* Avoids using language built-in sorting utilities.

---

## ⚙️ Expected Approach

The problem expects an algorithm based on:

* Divide and Conquer strategy
* Recursive or iterative efficient sorting method
* Stable and scalable sorting behavior

Typical suitable algorithms include:

* Merge Sort
* Heap Sort
* Quick Sort (optimized)

---

## ⏱ Time Complexity Requirement

```
O(n log n)
```

Algorithms with `O(n²)` complexity will not pass large test cases.

---

## 💾 Space Complexity Goal

Use the **smallest additional memory** possible while maintaining required performance.

---

## 🧠 Concepts Tested

* Recursion
* Divide & Conquer
* Array manipulation
* Algorithm optimization
* Sorting fundamentals

---

## ⭐ Key Learning Outcome

Understand how efficient sorting algorithms work internally instead of relying on built-in functions.

---
