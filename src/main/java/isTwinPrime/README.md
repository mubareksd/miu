#

A twin prime is a prime number that differs from another prime number by 2. Write a function named isTwinPrime with an integer parameter that returns 1 if the parameter is a twin prime, otherwise it returns 0. Recall that a prime number is a number with no factors other than 1 and itself.

the function signature is

`int isTwinPrime(int n)`

Examples:

| number | is twin prime?                                      |
| ------ | --------------------------------------------------- |
| 5      | yes, 5 is prime, 5+2 is prime                       |
| 7      | yes, 7 is prime, 7-2 is prime                       |
| 53     | no, 53 is prime, but neither 53-2 nor 53+2 is prime |
| 9      | no, 9 is not prime                                  |
