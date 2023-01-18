package miu_15;

public class SolutionOne {

    public static int isInertial(int[] a) {
        int odd = 0;
        int max = a[0];
        int flag = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                odd++;

            if (a[i] > max)
                max = a[i];
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                {
                    for (int k = 0; k < a.length; k++) {
                        if (a[k] % 2 == 0) {
                            if (a[k] != max)
                                if (a[j] < a[k]) {
                                    flag = 0;
                                }
                        }
                    }
                }
            }
        }

        if (odd != 0 && max % 2 == 0 && flag == 1) {

            return 1;
        }

        return 0;
    }
}