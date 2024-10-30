# Array and String Algorithms Project

## Project Overview
This project implements operations on multi-dimensional arrays and basic string algorithms in Java. The project includes:
- **2D Array Operations** such as insertion, deletion, and traversal of rows and columns, as well as matrix transposition.
- **String Algorithms** implementing the Knuth-Morris-Pratt (KMP) pattern matching algorithm and Run-Length Encoding (RLE) for string compression.

## Folder Structure
ArrayStringAlgorithms/ ├── src/ │ ├── TwoDimensionalArray.java # Class implementing 2D array operations │ ├── StringAlgorithms.java # Class implementing KMP and RLE algorithms │ ├── MainTwoDimensionalArray.java # Main class for testing 2D array operations │ └── MainStringAlgorithms.java # Main class for testing string algorithms ├── README.md # Project overview and instructions

## Prerequisites
Ensure you have **Java JDK** installed and configured in your system's PATH. You can check by running:
```bash
java -version
javac -version

## Instructions to Compile and Run
Step 1: Compile the Java Files
1. Open a terminal or command prompt.
2. Navigate to the src folder where all the Java files are located:
cd path/to/ArrayStringAlgorithms/src
3. Compile all Java files:
javac TwoDimensionalArray.java StringAlgorithms.java MainTwoDimensionalArray.java MainStringAlgorithms.java

Step 2: Run the Test Classes
After successful compilation, run each main class to test the respective algorithms.

Run 2D Array Operations:
java MainTwoDimensionalArray

Expected Output:
After insertRow, insertColumn, and deleteRow:
[[3, 4]]
Transpose of matrix [[1, 2], [3, 4]]:
[[1, 3], [2, 4]]

Run String Algorithms:
java MainStringAlgorithms

Expected Output:
KMP Pattern Matching result for 'abcaby' in 'abxabcabcaby': 6
Run Length Encoding of 'aaabbbcccaaa': 3a3b3c3a

## Expected Outcomes
This project demonstrates:

* Proficiency in handling multi-dimensional arrays and performing operations on them.
* Understanding and implementation of the KMP algorithm for efficient pattern matching.
* Ability to compress strings using Run-Length Encoding (RLE).
* A foundation in analyzing the complexities of these algorithms, detailed in a separate complexity analysis report.

## Notes
* Each main class serves as a standalone tester for the respective algorithms.
* Ensure that you run each main class after compiling to observe the expected outputs.
* This README.md file is for instructional purposes and should be included in the root directory of the project.