package miu_47;

public class QuestionB {
    public static int checkConcatenatedSum(int n, int catlen) {

        int sum = 0;
        int tempn = n;

        if (tempn <= 0 || catlen <= 0) {
            return 0;
        }

        while (tempn >= 1) {
            int lastDigit = tempn % 10;
            int tempsum = 0;
            int tens = 1;
            for (int i = 1; i <= catlen; i++) {
                tempsum += lastDigit * tens;
                tens *= 10;
            }
            tempn /= 10;
            sum += tempsum;
        }

        return sum == n ? 1 : 0;

    }

}
