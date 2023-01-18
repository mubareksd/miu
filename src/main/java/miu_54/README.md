### QUEESTION 1

A number n is vesuvian if it is the sum of two different pairs of squares. For example, 50 is vesuvian because 50 == 25 + 25 and 1 + 49. The numbers 65 (1+64, 16+49) and 85 (4+81, 36+49) are also vesuvian. 789 of the first 10,000 integers are vesuvian.

Write a function named isVesuvian that returns 1 if its parameter is a vesuvian number, otherwise it returns 0. Hint: be sure to verify that your function detects that 50 is a vesuvian
number!

### QUEESTION 2

Define an array to be one-balanced if begins with zero or more 1s followed by zero or more non-1s and concludes with zero or more 1s. Write a function named isOneBalanced that returns 1 if its array argument is one-balanced, otherwise it returns 0.

If you are programming in Java or C#, the function signature is

`int isOneBalanced(int[ ] a)`

If you are programming in C or C++, the function signature is

`int isOneBalanced(int a[ ], int len)` where len is the number of elements in the array a.

Examples

| if a is                        | then function returns | reason                                                                                     |
| ------------------------------ | --------------------- | ------------------------------------------------------------------------------------------ |
| {1, 1, 1, 2, 3, -18, 45, 1}    | 1                     | because it begins with three 1s, followed by four non-1s and ends with one 1 and 3+1 == 4  |
| {1, 1, 1, 2, 3, -18, 45, 1, 0} | 0                     | because the 0 starts another sequence of non-1s. There can be only one sequence of non-1s. |
| {1, 1, 2, 3, 1, -18, 26, 1}    | 0                     | because there are two sequences of non-1s ({2, 3} and {-18, 26}                            |
| {}                             | 1                     | because 0 (# of beginning 1s) + 0 (# of ending 1s) = 0 (# of non-1s)                       |
| {3, 4, 1, 1}                   | 1                     | because 0 (# of beginning 1s) + 2 (# of ending 1s) = 2 (# of non-1s)                       |
| {1, 1, 3, 4}                   | 1                     | because 2 (# of beginning 1s) + 0 (# of ending 1s) = 2 (# of non-1s)                       |
| {3, 3, 3, 3, 3, 3}             | 0                     | because 0 (# of beginning 1s) + 0 (# of ending 1s) != 6 (# of non-1s)                      |
| {1, 1, 1, 1, 1, 1}             | 0                     | because 6 (# of beginning 1s) + 0 (# of ending 1s) != 0 (# of non-1s)                      |

### QUEESTION 3

The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and second numbers are 1 and after that ni = ni-2 + ni-1, e.g., 34 = 13 + 21. Write a method with signature

`int isFibonacci(int n)` which returns 1 if its argument is a number in the Fibonacci sequence, otherwise it returns 0. For example, isFibonacci(13) returns a 1 and isFibonacci(27) returns a 0. Your solution must not use recursion because unless you cache the Fibonacci numbers as you find them, the recursive solution recomputes the same Fibonacci number many times.
