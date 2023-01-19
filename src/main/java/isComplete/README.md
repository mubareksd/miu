#

An array is called complete if it contains an even element, a perfect square and two different elements that sum to 8. For example, {3, 2, 9, 5} is complete because 2 is even, 9 is a perfect square and a[0] + a[3] = 8.

Write a function named isComplete that accepts an integer array and returns 1 if it is a complete array, otherwise it returns 0. Your method must be efficient. It must return as soon as it is known that the array is complete. Hint: reuse the method you wrote for question 1.

If you are programming in Java or C#, the function signature is

`int isComplete(int[ ] a)`

If you are programming in C or C++, the function signature is

`int isComplete(int a[ ], int len)` where len is the number of elements in the array

Other examples

| if the input array is            | return | reason                                                                          |
| -------------------------------- | ------ | ------------------------------------------------------------------------------- |
| {36, -28}                        | 1      | 36 is even, 36 is a perfect square, 36-28 = 8                                   |
| {36, 28}                         | 0      | There are no two elements that sum to 8                                         |
| {4}                              | 0      | It does not have two different elements that sum to 8 (you can't use a[0]+a[0]) |
| {3, 2, 1, 1, 5, 6}               | 0      | there is no perfect square.                                                     |
| {3, 7, 23, 13, 107, -99, 97, 81} | 0      | there is no even number.                                                        |
