# QUESTION 07

Write a function named primeCount, The function returns the number of primes between start and end inclusive. Recall that a prime is a positive integer greater than 1 whose only integer factors are 1 and itself.

The signature of the function is:

`int primeCount(int start, int end);`

Examples

| If start is | and end is | return | reason                                                                       |
| ----------- | ---------- | ------ | ---------------------------------------------------------------------------- |
| 10          | 30         | 6      | Reason: The primes between 10 and 30 inclusive are 11, 13, 17, 19, 23 and 29 |
| 11          | 29         | 6      | Reason: The primes between 11 and 29 inclusive are 11, 13, 17, 19, 23 and 29 |
| 20          | 22         | 0      | Reason: 20, 21, and 22 are all non-prime                                     |
| 1           | 1          | 0      | Reason: By definition, 1 is not a prime number                               |
| 5           | 5          | 1      | Reason: 5 is a prime number                                                  |
| 6           | 2          | 0      | Reason: start must be less than or equal to end                              |
| -10         | 6          | 3      | Reason: primes are greater than 1 and 2, 3, 5 are prime                      |
