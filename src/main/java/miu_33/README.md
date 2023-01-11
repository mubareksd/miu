Define an array to be sum-safe if none of its elements is equal to the sum of its elements. The
array
a = {5, -5, 0} is not sum-safe because the sum of its elements is 0 and a[2] == 0. However, the
array a = {5, -2, 1} is sum-safe because the sum of its elements is 4 and none of its elements
equal 4.
Write a function named isSumSafe that returns 1 if its argument is sum-safe, otherwise it returns
0.
If you are writing in Java or C#, the function signature is
int isSumSafe(int[ ]a)
If you are writing in C++ or C, the function signature is
int isSumSafe(int a[ ], int len) where len is the number of elements in a.
For example, isSumSafe(new int[ ] {5, -5, 0}) should return 0 and isSumSafe(new int[ ]{5, -2,
1}) should return 1.
Return 0 if the array is empty