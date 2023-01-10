package miu_14;

public class SolutionOne {

    static int isMadhavArray(int[] a) {
        Boolean flag = false;
        int ret = 1;
        for (int n = 0; n < a.length; n++) {
            if (n * (n + 1) / 2 == a.length) {
                flag = true;
                break;
            }
        }

        if (flag) {
            int sum = 0;
            int counter = 0;
            for (int i = 0; i < a.length; i = i + counter) {
                sum = 0;
                for (int j = i; j <= i + counter; j++) {
                    sum += a[j];
                }
                if (sum != a[0]) {
                    ret = 0;
                    break;
                }
                counter++;
            }
        } else {
            ret = 0;
        }

        return ret;

    }
}
