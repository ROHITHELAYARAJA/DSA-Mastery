# <p align="center"><img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=38&pause=1000&color=F7DF1E&center=true&vCenter=true&width=700&lines=LeetCode+Problem+Solving+Journey;DSA+%E2%80%A2+Algorithms+%E2%80%A2+Interviews;Mastering+The+Code+Craft" alt="Typing SVG" /></p>

<p align="center">
  <img src="https://img.shields.io/badge/Focus-FAANG_Preparation-FF4B4B?style=for-the-badge&logo=leetcode&logoColor=white" />
  <img src="https://img.shields.io/badge/Language-Java_%26_Python-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white" />
  <img src="https://img.shields.io/badge/Status-Actively_Solving-4CAF50?style=for-the-badge" />
</p>

---

### 🚀 Hero Section
**Developer:** Rohith.E  
**Mission:** To master Data Structures and Algorithms while building a foundation for a career at top-tier product companies. This repository serves as a live documentation of my logic, clean code practices, and consistency.

---

### 🧠 Problem Categories
<table align="center">
  <tr>
    <td align="center"><b>Arrays & Strings</b></td>
    <td align="center"><b>Two Pointers & Sliding Window</b></td>
  </tr>
  <tr>
    <td>
      <ul>
        <li><a href="./Arrays">Arrays</a></li>
        <li><a href="./Strings">Strings</a></li>
        <li><a href="./HashMap">HashMap / HashSet</a></li>
      </ul>
    </td>
    <td>
      <ul>
        <li><a href="./Two-Pointers">Two Pointers</a></li>
        <li><a href="./Sliding-Window">Sliding Window</a></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td align="center"><b>Advanced Logic</b></td>
    <td align="center"><b>Data Structures</b></td>
  </tr>
  <tr>
    <td>
      <ul>
        <li><a href="./DP">Dynamic Programming</a></li>
        <li><a href="./Backtracking">Backtracking</a></li>
        <li><a href="./Greedy">Greedy Algorithms</a></li>
        <li><a href="./Recursion">Recursion</a></li>
      </ul>
    </td>
    <td>
      <ul>
        <li><a href="./Trees">Trees</a></li>
        <li><a href="./Graphs">Graphs</a></li>
        <li><a href="./Linked-List">Linked Lists</a></li>
        <li><a href="./Stack-Queue">Stack & Queue</a></li>
      </ul>
    </td>
  </tr>
</table>

---

### 📊 Progress Tracker
> "Consistency is what transforms average into excellence."

| Metric | Status |
| :--- | :--- |
| 🟢 **Easy Problems** | `Count_Here` |
| 🟡 **Medium Problems** | `Count_Here` |
| 🔴 **Hard Problems** | `Count_Here` |
| 🔥 **Daily Streak** | `Check LeetCode Profile` |
| 🎯 **Interview Readiness** | `Targeting 100%` |

---

### 🏆 Skills Gained
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![Data Structures](https://img.shields.io/badge/Data_Structures-FFD700?style=for-the-badge&logo=databricks&logoColor=black)
![Algorithms](https://img.shields.io/badge/Algorithms-00599C?style=for-the-badge&logo=gitbook&logoColor=white)
![Problem Solving](https://img.shields.io/badge/Problem_Solving-4CAF50?style=for-the-badge)

---

### 💻 Code Spotlight: Mirror Frequency Distance
```python
# Logic: Sum of |freq(c) - freq(m)| for unique pairs
def solve_mirror_distance(s):
    freq = {}
    for char in s:
        freq[char] = freq.get(char, 0) + 1
    
    total_sum, seen = 0, set()
    for c in freq:
        # Mirror Logic for letters and digits
        m = chr(ord('a') + ord('z') - ord(c)) if c.isalpha() else chr(ord('0') + ord('9') - ord(c))
        
        pair = tuple(sorted((c, m)))
        if pair not in seen:
            total_sum += abs(freq.get(c, 0) - freq.get(m, 0))
            seen.add(pair)
    return total_sum