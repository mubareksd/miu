package miu_50;

public class QuestionC {

    public static int decodeArray(int[] a) {
        int start = 0, i, count = 0, ans = 0;
        if (a[0] == -1)
            start = 1;

        for (i = start; i < a.length; i++) {
            if (a[i] == 0)
                ++count;
            else {
                ans = ans * 10 + count;
                count = 0;
            }
        }

        return start == 0 ? ans : -1 * ans;
    }
}
