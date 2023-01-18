package miu_44;

public class SolutionOne {

    static int isPacked(int[] a) {

        if (a.length == 2 && a[0] != a[1]) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {
                return 0;
            }

            if (actualCount(a, a[i]) != countAppears(a, a[i])) {
                return 0;
            }

            if (countAppears(a, a[i]) > a[i]) {
                return 0;
            }
        }

        return 1;

    }

    static int actualCount(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        return count;
    }

    static int countAppears(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
                if (i <= a.length - 2 && a[i + 1] != a[i]) {
                    break;
                }
            }
        }
        return count;
    }

}
