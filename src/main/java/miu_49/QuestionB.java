package miu_49;

public class QuestionB {
    
    public static int isCubePowerful(int n) {

        if(n <= 0) {
            return 0;
        } 

        int sum = 0;

        int k = n;

        while(k > 0) {
            int lastDigit = k % 10;
            int tempSum = 0;
            tempSum = lastDigit * lastDigit * lastDigit;
            sum += tempSum;
            k /= 10;
        }

        return sum == n ? 1 : 0;

    }

}
