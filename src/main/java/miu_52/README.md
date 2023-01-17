### Question 1

An array is called systematically increasing if it consists of increasing sequences of the numbers from 1 to n.

The first six (there are over 65,000 of them) systematically increasing arrays are:

{1}

{1, 1, 2}

{1, 1, 2, 1, 2, 3}

{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}

{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}

{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}

Write a function named isSystematicallyIncreasing which returns 1 if its array argument is
systematically increasing. Otherwise it returns 0.

If you are programming in Java or C#, the function signature is

`int isSystematicallyIncreasing(int[ ] a)`

If you are programming in C or C++, the function signature is

`int isSystematicallyIncreasing(int a[ ], int len)` where len is the number of elements in the array a.

Examples

| a is               | then function returns | reason                                                                                              |
| ------------------ | --------------------- | --------------------------------------------------------------------------------------------------- |
| {1}                | 1                     | because 1 is a sequence from 1 to 1 and is the only sequence.                                       |
| {1, 2, 1, 2, 3}    | 0                     | because it is missing the sequence from 1 to 1.                                                     |
| {1, 1, 3}          | 0                     | because {1, 3} is not a sequence from 1 to n for any n.                                             |
| {1, 2, 1, 2, 1, 2} | 0                     | because it contains more than one sequence from 1 to 2.                                             |
| {1, 2, 3, 1, 2, 1} | 0                     | because it is “backwards”, i.e., the sequences from 1 to n are not ordered by increasing value of n |
| {1, 1, 2, 3}       | 0                     | because the sequence {1, 2} is missing (it should precede {1, 2, 3})                                |

### Question 2

A positive, non-zero number n is a factorial prime if it is equal to factorial(n) + 1 for some n and it is prime. Recall that factorial(n) is equal to 1 _ 2 _ ... _ n-1 _ n. If you understand recursion, the recursive definition is

`factorial(1) = 1;`

`factorial(n) = n*factorial(n-1)`.

For example, `factorial(5) = 1*2*3*4\*5 = 120`.

Recall that a prime number is a natural number which has exactly two distinct natural number divisors: 1 and itself.

Write a method named isFactorialPrime which returns 1 if its argument is a factorial prime number, otherwise it returns 0.

The signature of the method is

`int isFactorialPrime(int n)`

Examples

| if n is | then function returns | reason                                                                                 |
| ------- | --------------------- | -------------------------------------------------------------------------------------- |
| 2       | 1                     | because 2 is prime and is equal to factorial(1) + 1                                    |
| 3       | 1                     | because 3 is prime and is equal to factorial(2) + 1                                    |
| 7       | 1                     | because 7 prime and is equal to factorial(3) + 1                                       |
| 8       | 0                     | because 8 is not prime                                                                 |
| 11      | 0                     | because 11 does not equal factorial(n) + 1 for any n (factorial(3)=6, factorial(4)=24) |
| 721     | 0                     | because 721 is not prime (its factors are 7 and 103.                                   |

### Question 3

Write a function named largestDifferenceOfEvens which returns the largest difference between even valued elements of its array argument. For example largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9}) returns 6 = (4 – (-2)). If there are fewer than 2 even numbers in the array, largestDifferenceOfEvens should return -1.

If you are programming in Java or C#, the function signature is

`int largestDifferenceOfEvens(int[ ] a)`

If you are programming in C or C++, the function signature is

`int largestDifferenceOfEvens(int a[ ], int len)` where len is the number of elements in the array a.

Examples

| a is                        | then function returns | reason                                     |
| --------------------------- | --------------------- | ------------------------------------------ |
| {1, 3, 5, 9}                | -1                    | because there are no even numbers          |
| {1, 18, 5, 7, 33}           | -1                    | because there is only one even number (18) |
| {[2, 2, 2, 2]}              | 0                     | because 2-2 == 0                           |
| {1, 2, 1, 2, 1, 4, 1, 6, 4} | 4                     | because 6 – 2 == 4                         |
