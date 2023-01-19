#

Write a function named allValuesTheSame that returns 1 if all elements of its argument array have the same value. Otherwise, it returns 0.

If you are programming in Java or C#, the function signature is

`int allValuesTheSame(int[ ] a)`

If you are programming in C or C++, the function signature is

`int allValuesTheSame(int a[ ], int len)` where len is the number of elements in a

Examples:

| if a is                           | return                                                     |
| --------------------------------- | ---------------------------------------------------------- |
| {1, 1, 1, 1}                      | 1                                                          |
| {83, 83, 83}                      | 1                                                          |
| {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} | 1                                                          |
| {1, -2343456, 1, -2343456}        | 0 (because there are two different values, 1 and -2343456) |
| {0, 0, 0, 0, -1}                  | 0 (because there are two different values, 0 and -1)       |
| {432123456}                       | 1                                                          |
| {-432123456}                      | 1                                                          |
| { }                               | 0                                                          |
