#

A Daphne array is defined to be an array where every 1 is immediately followed by an odd number.

So {1, 5, 2, 4, 1, -7, 6} is a Daphne array because both 1s are immediately followed by an odd number. Some other examples of Daphne arrays are {1, 1, 1, 1, 3} and {3, 2, 4, 6}.

The array {1, 5, 2, 1, 4, 7} is not a Daphne array because the second 1 is immediately followed by a 4 which is not odd. The array {1, 1, 1, 1} is not a Daphne array because the last 1 is not followed by any number.

Write a function name isDaphneArray that returns 1 if its array argument is a Daphne array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is

`intisDaphneArray(int[ ] a)`

If you are programming in C or C++, the function signature is

`intisDaphneArray(int a[ ], intlen)` where len is the number of elements in a.
