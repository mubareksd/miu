package miu_50;

public class QuestionA {
    static int isZeroPlentiful(int[] a) {
        if (a.length < 4)
            return 0;

        int i, zeroCount = 0, plentyCount = 0;

        for (i = 0; i < a.length; i++) {
            if (a[i] == 0)
                ++zeroCount;
            else {
                if (zeroCount > 0 && zeroCount < 4)
                    return 0;
                else if (zeroCount >= 4) {
                    ++plentyCount;
                    zeroCount = 0;
                }
            }
        }
        if (zeroCount > 0 && zeroCount < 4)
            return 0;
        plentyCount += zeroCount / 4;

        // return plentyCount;
        return (plentyCount >= 1 ? 1 : 0);
    }
}