package miu_56;

public class QuestionC {
    static int isPairedN(int[] a, int n) {

        int sumUp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[i] + a[j] == n && i + j == n) {
                        sumUp = 1;
                    }
                }
            }
        }

        return sumUp;

    }

}