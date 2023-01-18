package miu_46;

public class QuestionA {
    static int getExponent(int n, int p) {

        if (p <= 1) {
            return -1;
        }

        int exp = 0;
        int largestExp = 0;

        while (Math.abs(n) >= (int) Math.pow(p, exp)) {
            if (n % (int) Math.pow(p, exp) == 0) {
                System.out.println(exp);
                largestExp = exp;
            }
            exp++;
        }

        return largestExp;

    }

}
