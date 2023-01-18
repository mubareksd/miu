package miu_22;

public class SolutionOne {
    public static int[] solve() {

        int x = 0, y = 0;

        int sum = getFactorial(10);
        for (int i = 10; i >= 0; i--) {
            x = getFactorial(i);
            for (int j = 9; j >= 0; j--) {
                y = getFactorial(j);
                if (x + y == sum) {

                    return new int[] { x, y };
                }
            }
        }
        return new int[] { 0, 0 };
    }

    public static int getFactorial(int n) {

        int fact = n;

        for (int i = n - 1; i > 1; i--) {
            fact *= i;
        }

        return fact;
    }
}
