#

Define the **n-upcount** of an array to be the number of times the partial sum goes from less than or equal to n to greater than n during the calculation of the sum of the elements of the array.

if you are programming in Java or C#, the function signature is `int nUpCount(int[] a, int n)`

if you are programming in C or C++, the function signature is `int nUpCount(int[] a, int len, int n)` where len is the number of elements in the array

for example, if n=5, the 5-upcount of the array {2, 3, 1, -6, 8, -3, -1, 2} is 3

| i   | a[i] | partial sum | upcount | comment                      |
| --- | ---- | ----------- | ------- | ---------------------------- |
| 0   | 2    | 2           |         |                              |
| 1   | 3    | 5           |         |                              |
| 2   | 1    | 6           | 1       | partial sum goes from 5 to 6 |
| 3   | -6   | 0           |         |                              |
| 4   | 8    | 8           | 2       | partial sum goes from 0 to 8 |
| 5   | -3   | 5           |         |                              |
| 6   | -1   | 4           |         |                              |
| 7   | 2    | 6           | 3       | partial sum goes from 4 to 6 |

Notice that the three rows in the count column that contain values correspond to times when the partial sum goes from less or equal to 5 to greater than 5.

Note that the partial sum is initialized to 0. For example, the 6 upcount of the array {6, 3, 1} is 1

| i   | a[i] | partial sum | upcount | comment                                    |
| --- | ---- | ----------- | ------- | ------------------------------------------ |
| 0   | 6    | 6           |         | partial sum goes from 0 (its initial) to 6 |
| 1   | 3    | 9           |         |                                            |
| 2   | 1    | 10          | 1       |                                            |
