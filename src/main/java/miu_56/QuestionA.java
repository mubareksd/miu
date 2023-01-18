package miu_56;

public class QuestionA {
    static int[] computeHMS(int n) {

        int hour = 0;
        int minute = 0;
        int seconds = 0;

        while (n > 0) {
            if (n - 3600 >= 0) {
                n = n - 3600;
                hour++;
            } else if (n - 60 >= 0) {
                n = n - 60;
                minute++;
            } else {
                n = n - 1;
                seconds++;
            }
        }

        return new int[] { hour, minute, seconds };

    }

}
