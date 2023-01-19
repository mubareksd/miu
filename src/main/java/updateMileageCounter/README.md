#

A mileage counter is used to measure mileage in an automobile. A mileage counter looks something like this

| 0   | 5   | 9   | 9   | 8   |
| --- | --- | --- | --- | --- |

The above mileage counter says that the car has traveled 5,998 miles. Each mile traveled by the automobile increments the mileage counter. Here is how the above mileage counter changes over a 3 mile drive.

After the first mile

| 0   | 5   | 9   | 9   | 9   |
| --- | --- | --- | --- | --- |

After the second mile

| 0   | 6   | 0   | 0   | 0   |
| --- | --- | --- | --- | --- |

After the third mile

| 0   | 6   | 0   | 0   | 1   |
| --- | --- | --- | --- | --- |

A mileage counter can be represented as an array. The mileage counter

| 0   | 5   | 9   | 9   | 8   |
| --- | --- | --- | --- | --- |

can be represented as the array

int a[ ] = new int[ ] {8, 9, 9, 5, 0}

Note that the mileage counter is "backwards" in the array, a[0] represents ones, a[1] represents tens, a[2] represents hundreds, etc.

Write a function named updateMileage that takes an array representation of a mileage counter (which can be arbitrarily long) and adds a given number of miles to the array. Since arrays are passed by reference you can update the array in the function, you do not have to return the updated array.

You do not have to do any error checking. You may assume that the array contains non-negative digits and that the mileage is non-negative

If you are programming in Java or C#, the function signature is

`void updateMileage counter(int[ ] a, int miles)`

If you are programming in C or C++, the function signature is

`void updateMileage counter(int a[ ], int miles, int len)` where len is the number of elements in the array

Examples:

| if the input array is          | and the mileage is | the array becomes              |
| ------------------------------ | ------------------ | ------------------------------ |
| {8, 9, 9, 5, 0}                | 1                  | {9, 9, 9, 5, 0}                |
| {8, 9, 9, 5, 0}                | 2                  | {0, 0, 0, 6, 0}                |
| {9, 9, 9, 9, 9, 9, 9, 9, 9, 9} | 1                  | {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} |
| {9, 9, 9, 9, 9, 9, 9, 9, 9, 9} | 13                 | {2, 1, 0, 0, 0, 0, 0, 0, 0, 0} |

Note that the mileage counter wraps around if it reaches all 9s and there is still some mileage to add.

Hint: Write a helper function that adds 1 to the mileage counter and call the helper function once for each mile
