package miu_47;

public class QuestionA {

    public static int largestAdjacentSum(int[] a) {

        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > sum)
                sum = a[i] + a[i + 1];
        }

        return sum;
    }

}
