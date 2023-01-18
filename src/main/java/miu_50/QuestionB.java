package miu_50;

public class QuestionB {

    static int isDigitIncreasing(int n) {
        int sum, pow, i;

        for (i = 1; i <= 9; i++) {
            sum = 0;
            pow = 1;
            for (;;) {
                sum += i * pow;
                pow = pow * 10 + 1;
                if (sum == n)
                    return 1;
                else if (sum > n)
                    break;
            }
        }

        return 0;
    }
}
