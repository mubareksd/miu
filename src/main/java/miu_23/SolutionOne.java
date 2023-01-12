package miu_23;

public class SolutionOne {

    public static int repsEqual(int[] a, int n) {
        int reps = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (n % 10 == a[i]) {
                reps = 1;
            } else {
                reps = 0;
                break;
            }
            n = n / 10;
        }

        return reps;
    }

}
