# Complexity Analysis Report

## Introduction
This report provides an analysis of the time and space complexities of the algorithms implemented in the Array and String Algorithms project. Each algorithm’s performance is evaluated using **Big O**, **Omega**, and **Theta** notations. Additionally, the **best**, **average**, and **worst-case** scenarios are analyzed for each.

---

## 1. Two-Dimensional Array Operations

### 1.1 Row and Column Insertion
- **Description**: Adds a row or column to a specific position in the 2D array.
- **Time Complexity**:
  - **Best Case (Ω)**: O(1) – when inserting at the beginning or end without shifting.
  - **Average Case (Θ)**: O(n) – assuming insertion in the middle requiring shifts.
  - **Worst Case (O)**: O(n) – insertion requires shifting elements in the entire row/column.
- **Space Complexity**: O(n) – additional space for resizing the array if capacity is exceeded.

### 1.2 Row and Column Deletion
- **Description**: Deletes a row or column from a specific position in the 2D array.
- **Time Complexity**:
  - **Best Case (Ω)**: O(1) – when deleting the last row or column.
  - **Average Case (Θ)**: O(n) – assuming deletion from the middle.
  - **Worst Case (O)**: O(n) – all elements must be shifted to maintain array structure.
- **Space Complexity**: O(1) – no extra space needed beyond the array itself.

### 1.3 Transpose of a Matrix
- **Description**: Converts rows to columns and vice versa in a 2D array.
- **Time Complexity**:
  - **Best, Average, and Worst Case**: O(n * m) – all elements must be accessed and repositioned.
- **Space Complexity**: O(n * m) – requires an additional array of the same size for the transposed matrix.

---

## 2. String Algorithms

### 2.1 Knuth-Morris-Pratt (KMP) Pattern Matching
- **Description**: Searches for a substring (pattern) within a text string using a prefix table.
- **Time Complexity**:
  - **Best Case (Ω)**: O(m) – pattern is not found, and only initial comparisons are made.
  - **Average Case (Θ)**: O(n) – generally, KMP performs linearly relative to text length.
  - **Worst Case (O)**: O(n) – pattern search requires traversing the entire text.
  - **Where**:
    - n = length of the text
    - m = length of the pattern
- **Space Complexity**: O(m) – additional space for the prefix table of the pattern.

### 2.2 Run-Length Encoding (RLE) Compression
- **Description**: Compresses a string by encoding consecutive identical characters as counts.
- **Time Complexity**:
  - **Best Case (Ω)**: O(n) – no repetitions, requiring only one scan of the string.
  - **Average Case (Θ)**: O(n) – each character is processed, generally in one pass.
  - **Worst Case (O)**: O(n) – all characters are unique and require processing individually.
  - **Where**:
    - n = length of the input string
- **Space Complexity**: O(n) – additional space proportional to the output string, worst case similar in length to the input string.

---

## Summary Table

| Algorithm                  | Best Case (Ω) | Average Case (Θ) | Worst Case (O) | Space Complexity |
|----------------------------|---------------|-------------------|----------------|------------------|
| Row/Column Insertion       | O(1)          | O(n)             | O(n)          | O(n)            |
| Row/Column Deletion        | O(1)          | O(n)             | O(n)          | O(1)            |
| Transpose Matrix           | O(n * m)      | O(n * m)         | O(n * m)      | O(n * m)        |
| Knuth-Morris-Pratt (KMP)   | O(m)          | O(n)             | O(n)          | O(m)            |
| Run-Length Encoding (RLE)  | O(n)          | O(n)             | O(n)          | O(n)            |

---

## Conclusion
The analysis above provides a clear view of the efficiency of each algorithm implemented in this project. By evaluating the **best**, **average**, and **worst-case** complexities, we can better understand how each algorithm performs under different scenarios. This complexity analysis will help in identifying potential optimizations and understanding the practical applications of each algorithm.
