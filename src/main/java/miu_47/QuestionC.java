package miu_47;

public class QuestionC {

    static int isSequencedArray(int[] a, int m, int n) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
            if (a[i + 1] - a[i] > 1) {
                return 0;
            }
        }

        int countM = 0;
        int countN = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == m) {
                countM++;
            }
            if (a[i] == n) {
                countN++;
            }
            if (!(a[i] >= m && a[i] <= n)) {
                return 0;
            }
        }

        if (countM < 1 || countN < 1) {
            return 0;
        }

        return 1;

    }

}
