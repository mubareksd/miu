package miu_19;

public class SolutionOne {

    public static int stantonMeasure(int[] a) {
        int n = 0;
        int stanton = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                n++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == n) {
                stanton++;
            }
        }
        return stanton;
    }

}
