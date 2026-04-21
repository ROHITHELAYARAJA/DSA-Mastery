# 299. Bulls and Cows

## Problem

You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess the number.  
When your friend makes a guess, you provide a hint:

- **Bulls**: digits in the correct position.
- **Cows**: digits present in the secret number but in the wrong position.

Return the hint formatted as:

Where:
- `x` = number of bulls
- `y` = number of cows

---

## Example 1

**Input**
secret = "1807"
guess = "7810"


**Output**

1A3B


---

## Example 2

**Input**

secret = "1123"
guess = "0111"


**Output**

1A1B


---

## Constraints

- `1 <= secret.length, guess.length <= 1000`
- `secret.length == guess.length`
- Both strings consist of digits only.