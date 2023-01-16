### QUEESTION 1

An array is zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.

Write a method named isZeroPlentiful which returns the number of zero sequences if its array argument is zero-plentiful, otherwise it returns 0.

If you are programming in Java or C#, the function signature is

`int isZeroPlentiful(int[ ] a)`

If you are programming in C or C++, the function signature is

`int isZeroPlentiful(int a[ ], int len)` where len is the number of elements in the array a.

Examples

| a is                                                | then function returns | reason                                                               |
| --------------------------------------------------- | --------------------- | -------------------------------------------------------------------- |
| {0, 0, 0, 0, 0}                                     | 1                     | 1 because there is one sequence of 0s and its length >= 4.           |
| {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}       | 1                     | 2 because there are two sequences of 0s and both have lengths >= 4.  |
| {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0} | 1                     | 3 because three are three sequences of zeros and all have length >=4 |
| {1, 2, 3, 4}                                        | 0                     | 0 because there must be at least one 0.                              |
| {1, 0, 0, 0, 2, 0, 0, 0, 0}                         | 0                     | because there is a sequence of zeros whose length is less < 4.       |
| {0}                                                 | 0                     | because there is a sequence of zeroes whose length is < 4.           |
| {}                                                  | 0                     | because there must be at least one 0.                                |

### QUEESTION 2

A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9. For example 24 is digit-increasing because it equals 2 + 22 (here n = 2)

Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it returns 0.

The signature of the method is

`int isDigitIncreasing(int n)`

Examples

| if n is | then function returns | reason                             |
| ------- | --------------------- | ---------------------------------- |
| 7       | 1                     | because 7 = 7 (here n is 7)        |
| 36      | 1                     | because 36 = 3 + 33                |
| 984     | 1                     | because 984 = 8 + 88 + 888         |
| 7404    | 1                     | because 7404 = 6 + 66 + 666 + 6666 |

### QUEESTION 3

An integer number can be encoded as an array as follows. Each digit n of the number is represented by n zeros followed by a 1. So the digit 5 is represented by 0, 0, 0, 0, 0, 1. The encodings of each digit of a number are combined to form the encoding of the number. So the number 1234 is encoded as the array {0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}. The first 0, 1 is contributed by the digit 1, the next 0, 0, 1 is contributed by the digit 2, and so on.

There is one other encoding rule: if the number is negative, the first element of the encoded array must be -1, so -201 is encoded as {-1, 0, 0, 1, 1, 0, 1}. Note that the 0 digit is represented by no zeros, i.e. there are two consecutive ones!

Write a method named decodeArray that takes an encoded array and decodes it to return the number.

You may assume that the input array is a legal encoded array, i.e., that -1 will only appear as the first element, all elements are either 0, 1 or -1 and that the last element is 1.

If you are programming in Java or C#, the function prototype is

`int decodeArray(int[ ] a)`

If you are programming in C or C++, the function prototype is

`int decodeArray(int a[ ], int len);`

Examples

| a is                                                          | then function returns | reason                                                                                                                               |
| ------------------------------------------------------------- | --------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| {1}                                                           | 0                     | because the digit 0 is represented by no zeros followed by a one.                                                                    |
| {0, 1}                                                        | 1                     | because the digit 1 is represented by one zero followed by a one.                                                                    |
| {-1, 0, 1}                                                    | -1                    | because the encoding of a negative number begins with a -1 followed by the encoding of the absolute value of the number.             |
| {0, 1, 1, 1, 1, 1, 0, 1}                                      | 100001                | because the encoding of the first 1 is 0, 1, the encoding of each of the four 0s is just a 1 and the encoding of the last 1 is 0, 1. |
| {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1} | 999                   | because each 9 digit is encoded as 0,0,0,0,0,0,0,0,0,1.                                                                              |
