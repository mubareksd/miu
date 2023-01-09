 A number n>0 is called cube-powerful if it is equal to the sum of the cubes of its digits. 
Write a function named isCubePowerful that returns 1 if its argument is cube-powerful; otherwise it 
returns 0. 
The function prototype is 
int isCubePowerful(int n); 
Hint: use modulo 10 arithmetic to get the digits of the number. 
Examples: 
if n is return because 
153 1 because 153 = 13(1*1*1) + 53(5*5*5) + 33(3*3*3)
370 1 because 370 = 33(3*3*3) + 73(7*7*7) + 03 (0*0*0)
371 1 because 371 = 33 + 73 + 13 
407 1 because 407 = 43 + 03 + 73 
87 0 because 87 != 83 + 73 
0 0 because n must be greater than 0. 
-81 0 because n must be greater than 0.
