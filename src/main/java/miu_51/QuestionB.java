package miu_51;

public class QuestionB {
    
    static int isPrime(int n) {

        if(n < 2) {
            return 0;
        }

        for(int i=2; i < n; i++) {
            if(n % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    public static int isPrimeHappy(int n) {

        int sum = 0;  
        int i = 2;
        boolean primeFlag = false;

        while(n > i) {
            if(isPrime(i) == 1) {
                sum += i;
                primeFlag = true;
            }
            i++;
        }

        if(primeFlag == true && sum % n == 0) {
            return 1;
        }
        else {
            return 0;
        }

    }

}
