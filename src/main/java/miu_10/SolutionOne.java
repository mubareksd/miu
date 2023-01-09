package miu_10;

import java.util.Arrays;

public class SolutionOne {

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
