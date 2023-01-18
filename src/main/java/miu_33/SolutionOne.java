package miu_33;

public class SolutionOne {

    static int isSumSafe(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                return 0;
            }
        }

        return 1;

    }

}
