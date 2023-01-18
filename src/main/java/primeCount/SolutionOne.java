package primeCount;

import static prime.Prime.isPrime;

public class SolutionOne {

    public static int primeCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i > 1) {
                if (isPrime(i))
                    count++;
            }
        }
        return count;
    }
}
