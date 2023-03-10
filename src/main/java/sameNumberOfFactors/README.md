#

Write a function named sameNumberOfFactors that takes two integer arguments and returns 1 if they have the same number of factors. If either argument is negative, return -1. Otherwise return 0.

`int sameNumberOfFactors(int n1, int n2)`

Examples:

| if n1 is | and n2 is | return                                                                               |
| -------- | --------- | ------------------------------------------------------------------------------------ |
| -6       | 21        | -1 (because one of the arguments is negative)                                        |
| 6        | 21        | 1 (because 6 has four factors (1, 2, 3, 6) and so does 21 (1, 3, 7, 21)              |
| 8        | 12        | 0 (because 8 has four factors(1, 2, 4, 8) and 12 has six factors (1, 2, 3, 4, 6, 12) |
| 23       | 97        | 1 (because 23 has two factors (1, 23) and so does 97 (1, 97))                        |
| 0        | 1         | 0 (because 0 has no factors, but 1 has one (1))                                      |
| 0        | 0         | 1 (always true if n1 == n2)                                                          |
