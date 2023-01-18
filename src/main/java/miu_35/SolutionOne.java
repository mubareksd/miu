package miu_35;

public class SolutionOne {

    static int isVanaila(int[] a) {
        if (a.length == 1 || a.length == 0) {
            return 1;
        }

        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            while (current > 0) {
                int k = a[i] % 10;
                if (k != a[0]) {
                    return 0;
                }
                current = current / 10;
            }
        }

        return 1;

    }

}
