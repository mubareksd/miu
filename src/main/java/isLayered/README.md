#

An array is called layered if its elements are in ascending order and each element appears two or more times. For example, {1, 1, 2, 2, 2, 3, 3} is layered but {1, 2, 2, 2, 3, 3} and {3, 3, 1, 1, 1, 2, 2} are not. Write a method named isLayered that accepts an integer array and returns 1 if the array is layered, otherwise it returns 0.

If you are programming in Java or C#, the function signature is

`int isLayered(int[ ] a)`

If you are programming in C or C++, the function signature is

`int isLayered(int a[ ], int len)` where len is the number of elements in the array

Examples:

| If the input array is | return                                                  |
| --------------------- | ------------------------------------------------------- |
| {1, 1, 2, 2, 2, 3, 3} | 1                                                       |
| {3, 3, 3, 3, 3, 3, 3} | 1                                                       |
| {1, 2, 2, 2, 3, 3}    | 0 (because there is only one occurrence of the value 1) |
| {2, 2, 2, 3, 3, 1, 1} | 0 (because values are not in ascending order)           |
| {2}                   | 0                                                       |
| {}                    | 0                                                       |
