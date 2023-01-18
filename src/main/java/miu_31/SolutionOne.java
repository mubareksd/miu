package miu_31;

public class SolutionOne {

    static int matches(int[] a, int[] p) {

        int currentA = 0;

        for (int i = 0; i < p.length; i++) {
            int currentP = p[i];
            for (int j = currentA; j < Math.abs(currentP); j++) {
                if ((currentP > 0 && a[j] < 0) || currentP < 0 && a[j] > 0) {
                    return 0;
                }
            }
            currentA = Math.abs(currentP);
        }

        return 1;

    }

}
