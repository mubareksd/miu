package miu_57;

public class QuestionC {

    static int isCucumber(int[] a) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i != j) {
                    if (a[i] + a[j] == 15) {
                        count++;
                    }
                }
            }
        }

        return count != 1 ? 0 : 1;

    }

}
