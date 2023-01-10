package miu_14;

public class SolutionOne {

    static int isMadhavArray(int[] a) {
        Boolean flag = false;
        for (int n = 0; n < a.length; n++) {
            if (n * (n + 1) / 2 == a.length) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return 0;

        int sum;
        int counter = 0;
        for (int i = 0; i < a.length; i = i + counter) {
            sum = 0;
            for (int j = 1; j <= i + counter; j++) {

            }
            if (sum != a[0]) {
                return 0;
            }
            counter++;
        }

        return 1;
    }
}
