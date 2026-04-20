Readme · MDCopy2078. Two Furthest Houses With Different Colors
Problem Statement
There are n houses evenly lined up on the street, and each house is beautifully painted.
You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j).


Examples
Example 1
Input:  colors = [1,1,1,6,1,1,1]
Output: 3

House 0 (color 1) and House 3 (color 6) → distance = abs(0 - 3) = 3
Example 2
Input:  colors = [1,8,3,8,3]
Output: 4

House 0 (color 1) and House 4 (color 3) → distance = abs(0 - 4) = 4
Example 3
Input:  colors = [0,1]
Output: 1

House 0 (color 0) and House 1 (color 1) → distance = abs(0 - 1) = 1

Constraints

n == colors.length
2 <= n <= 100
0 <= colors[i] <= 100
Test data guarantees at least two houses have different colors


Approach
Two-pointer greedy scan from both ends:

Scan from the left end → find the first house from the right with a different color.
Scan from the right end → find the first house from the left with a different color.
Answer is the max of both distances.

Why this works: The furthest valid pair must involve either the first house (index 0) or the last house (index n-1). So we only need to check those two starting points.
Time Complexity: O(n)
Space Complexity: O(1)