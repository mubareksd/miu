package miu_40;

public class SolutionOne {
    static int checkIfTwoExists(int n) {

        while (n > 0) {
            if (n % 10 == 2) {
                return 1;
            }
            n = n / 10;
        }

        return 0;

    }

    static int smallest(int n) {

        int i = 1;
        for (;;) {
            int contain = 0;
            int k = 0;
            for (int j = 1; j <= n; j++) {
                k = i * j;
                if (checkIfTwoExists(k) == 1) {
                    contain++;
                }
            }
            if (contain == n) {
                break;
            }
            i++;
        }

        return i;

    }

    // static int checkIfTwoExists(int n) {

    // while (n > 0) {
    // if (n % 10 == 2) {
    // return 1;
    // }
    // n = n / 10;
    // }

    // return 0;

    // }

    // static int smallest(int n) {
    // int i = 1;
    // for (;;) {
    // int contain = 0;
    // int myNum = 0;
    // for (int j = 1; j <= n; j++) {
    // myNum = i * j;

    // if (checkIfTwoExists(myNum) == 1) {
    // contain++;

    // }
    // }
    // if (contain == n) {
    // break;
    // }

    // i++;

    // }
    // return i;
    // }
}
