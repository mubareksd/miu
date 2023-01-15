package miu_53;

public class QuestionA {
    
    public static int isHodder(int n) {

        int isPrime = 1;
        int isHod = 0;

        if(n < 2) isPrime = 0;

        for(int i=2; i < n; i++) {
            if(n % i == 0) {
                isPrime = 0;
            }
        }

        if(isPrime == 1) {
            for(int i=0; i < n; i++) {
                if(n == Math.pow(2, i) - 1) {
                    isHod = 1;
                }
            }
            
        }

        return isHod;

    }

}