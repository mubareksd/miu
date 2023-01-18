package miu_38;

public class SolutionOne {

    static int isSequentiallyBounded(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                return 0;
            }

        }

        for (int i = 0; i < a.length; i++) {

            int allowedCount = a[i] - 1;
            int actualCount = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    actualCount++;
                }
            }

            if (actualCount > allowedCount) {
                return 0;
            }

        }

        return 1;

    }

}
