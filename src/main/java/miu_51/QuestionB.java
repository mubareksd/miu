package miu_51;

import static prime.Prime.isPrime;

public class QuestionB {

    public static int isPrimeHappy(int n) {

        int sum = 0;
        int i = 2;
        boolean primeFlag = false;

        while (n > i) {
            if (isPrime(i)) {
                sum += i;
                primeFlag = true;
            }
            i++;
        }

        if (primeFlag == true && sum % n == 0) {
            return 1;
        } else {
            return 0;
        }

    }

}
