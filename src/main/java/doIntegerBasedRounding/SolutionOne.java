package doIntegerBasedRounding;

import java.util.Arrays;

public class SolutionOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[] { 1, 2, 3, 4, 5 }, 2)));
    }

    static int[] doIntegerBasedRounding(int[] is, int i) {
        i = Math.abs(i);
        for (int j = 0; j < is.length; j++) {
            int mod = is[j] % i;
            if (is[j] >= 0) {
                if (mod < i / 2f) {
                    is[j] -= mod;
                } else {
                    is[j] += (i - mod);
                }
            }
        }
        return is;
    }

}
