package miu_28;

public class SolutionOne {

    static int isSquare(int n) {

        if (n < 0) {
            return 0;
        }

        for (int i = 0; i <= n / 2; i++) {
            if (n == i * i) {
                return 1;
            }
        }

        return 0;

    }

}