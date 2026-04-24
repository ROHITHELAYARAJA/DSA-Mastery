# 657. Robot Return to Origin

## Problem

There is a robot starting at the position `(0, 0)`, the origin, on a 2D plane.

You are given a string `moves` that represents the move sequence of the robot where `moves[i]` represents its ith move.

Valid moves are:

- `'R'` → move right  
- `'L'` → move left  
- `'U'` → move up  
- `'D'` → move down  

Return `true` if the robot returns to the origin after it finishes all of its moves, otherwise return `false`.

**Note:**

- The robot's facing direction does not matter.
- Each move has the same magnitude.

---

## Example 1

Input:
moves = "UD"

Output:
true

Explanation:
The robot moves up once and down once, returning to the origin.

---

## Example 2

Input:
moves = "LL"

Output:
false

Explanation:
The robot moves left twice and does not return to the origin.

---

## Constraints

1 <= moves.length <= 2 * 10⁴

moves only contains the characters `'U'`, `'D'`, `'L'`, and `'R'`.