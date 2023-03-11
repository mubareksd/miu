package isInertial;

public class Inertial {

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

    public static int isInertial2(int[] a) {
        int hasOdd = 0;
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                hasOdd = 1; // a) at least euta odd xaki xaina check
            }
            if (a[i] > max) {
                max = a[i]; // b) calculate max
            }
        }
        if (max % 2 != 0 || hasOdd == 0) {
            return 0;// max value even xaina OR odd euta ni xaina, jun vaye ni return 0
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 1) { // odd value filter
                    for (int j = 0; j < a.length; j++) {
                        if (a[j] % 2 == 0 && a[j] != max && a[j] >= a[i]) // filter even value, which is
                            // not max and check if it is greater than odd value..even if one is greater
                            // then false
                            return 0;
                    }
                }
            }
        }
        return 1;
    }
}