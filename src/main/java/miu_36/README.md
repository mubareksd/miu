Define an array to be trivalent if all its elements are one of three different values. For
example, {22, 19, 10, 10, 19, 22, 22, 10} is trivalent because all elements are either 10, 22, or 19.
However, the array {1, 2, 2, 2, 2, 2, 2} is not trivalent because it contains only two different
values (1, 2). The array {2, 2, 3, 3, 3, 3, 2, 41, 65} is not trivalent because it contains four
different values (2, 3, 41, 65).
Write a function named isTrivalent that returns 1 if its array argument is trivalent, otherwise it
returns 0.
If you are writing in Java or C#, the function signature is
int isTrivalent (int[ ] a)
If you are writing in C or C++, the function signature is
int isTrivalent(int a[ ], int len) where len is the number of elements in the array a.
Hint: Remember that the elements of the array can be any value, so be careful how you
initialize your local variables! For example using -1 to initialize a variable won’t work
because -1 might be one of the values in the array.
Examples
if a is return Reason
{-1, 0, 1, 0, 0, 0} 1 All elements have one of three values (0, -1, 1)
{ } 0 There are no elements
{ 2147483647, -1, -1
-2147483648}
1 Again only three different values. Note that the
value of a[0] is the maximum integer and the value
of a[3] is the minimum integer so you can’t use
those to initialize local variables