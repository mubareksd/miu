package miu_17;

import static isPrime.Prime.*;

public class SolutionOne {

    static int nextPrimeEndsNine(int n) {
        int k = n + 1;
        while (!isPrime(k) || k % 10 != 9) {
            k++;
        }

        return k;
    }

    static int findPorcupineNumber(int n) {

        int num = 0;

        for (int i = 0; i < 1000; i++) {
            int nextPrimeEndsNine = nextPrimeEndsNine(n + i); // k = 19
            int nextPrime = nextPrime(nextPrimeEndsNine); // k = 23 if nextPr % 10 !== n continue checking (k = nextPen)

            if (nextPrime % 10 == 9) {
                num = nextPrimeEndsNine;
                break;
            } else {
                i++;
            }
        }

        return num;

    }

}
