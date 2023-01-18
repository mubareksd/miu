package miu_30;

public class SolutionOne {

    static int convertToBase10(int[] a, int base) {

        if (isLegalNumber(a, base) == 0) {
            return 0;
        }

        int sum = 0;
        int power = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            sum += (a[i] * Math.pow(base, power));
            System.out.println(sum);
            power++;
        }

        return sum;

    }

    static int isLegalNumber(int[] a, int base) {

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] > base) {
                return 0;
            }

        }

        return 1;

    }

}
