package miu_46;

public class QuestionB {
    public static int is121Array(int[] a) {

        if (a[0] != 1) {
            return 0;
        }

        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1 && a[i] != 2) {
                return 0;
            }
            if (a[i] == 1) {
                countOne++;
            }
            if (a[i] == 2) {
                countTwo++;
            }
        }

        if (countOne < 1 || countTwo < 1) {
            return 0;
        }

        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            if (a[i] == 2) {
                for (int k = i; k < j; k++) {
                    if (a[k] != 2) {
                        return 0;
                    }
                }
            }
            if (a[i] != a[j]) {
                return 0;
            }
        }

        return 1;

    }

}
