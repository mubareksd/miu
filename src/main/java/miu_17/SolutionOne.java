package miu_17;

public class SolutionOne {

    static int isPrime(int n) {
        int prime = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = 0;
            }
        }

        return prime;
    }

    static int nextPrime(int n) {
        int k = n + 1;
        while (isPrime(k) == 0) {
            k++;
        }

        return k;

    }

    static int nextPrimeEndsNine(int n) {
        int k = n + 1;
        while (isPrime(k) == 0 || k % 10 != 9) {
            k++;
        }

        return k;
    }

    static int findPorcupineNumber(int n) {

        int num = 0;

        for(int i=0; i < 1000; i++) {
            int nextPrimeEndsNine = nextPrimeEndsNine(n + i); // k = 19
            int nextPrime = nextPrime(nextPrimeEndsNine); // k = 23 if nextPr % 10 !== n continue checking (k = nextPen)
    
            if(nextPrime % 10 == 9) {
                num = nextPrimeEndsNine; 
                break;
            }
            else {
                i++;
            }
        }

        return num;

    }

}
