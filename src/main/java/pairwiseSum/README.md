#

Write a method named pairwiseSum that has an array with an even number of elements as a parameter and returns an array that contains the pairwise sums of the elements of its parameter array.

If you are writing in Java or C#, the function signature is

`int[ ] pairwiseSum(int[ ] a)`

If you are writing in C or C++, the function signature is

`int * pairwiseSum(int a[ ], int len)` where len is the length of a

The method returns null if

1. The array has no elements

2. The array has an odd number of elements

Otherwise, the method returns an array with arrayLength/2 elements. Each element of the returned array is the sum of successive pairs of elements of the original array. See examples for more details.

Examples

| if a is                              | return             | reason                                                                                                                                                                                                        |
| ------------------------------------ | ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| {2, 1, 18, -5}                       | {3, 13}            | because 2+1=3, 18+-5=13. Note that there are exactly 2 elements in the returned array. You will lose full marks for this question if you return {3, 13, 0, 0}!                                                |
| {2, 1, 18, -5, -5, -15, 0, 0, 1, -1} | {3, 13, -20, 0, 0} | because 2+1=3, 18+-5=13, -5+-15=-20, 0+0=0, 1+-1=0. Note that there are exactly 5 elements in the returned array. You will lose full marks for this question if you return {3, 13, -20, 0, 0, 0, 0, 0, 0, 0}! |
| {2, 1, 18}                           | null               | because there are an odd number of elements in the array.                                                                                                                                                     |
| {}                                   | null               | because there are no elements in the array                                                                                                                                                                    |
