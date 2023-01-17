package miu_51;

public class QuestionA {
    public static int isOnionArray(int[] a) {

        for (int j = 0, k = a.length - 1; j < a.length; j++, k--) {
            if (j != k) {
                if (a[j] + a[k] > 10) {
                    return 0;
                }
            }

        }

        return 1;

    }

}
