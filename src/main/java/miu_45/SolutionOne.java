package miu_45;

public class SolutionOne {

    static int isOddHeavy(int[] a) {

        boolean gotOdd = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                gotOdd = true;
            }
        }

        if (gotOdd) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    for (int j = 0; j < a.length; j++) {
                        if (a[i] < a[j]) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            return 0;
        }

        return 1;

    }

}
