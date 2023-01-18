package miu_53;

import static prime.Prime.isPrime;

public class QuestionA {

    public static int isHodder(int n) {
        int isHod = 0;

        if (isPrime(n))
            for (int i = 0; i < n; i++)
                if (n == Math.pow(2, i) - 1)
                    isHod = 1;
        return isHod;
    }
}