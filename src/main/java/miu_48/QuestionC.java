package miu_48;

public class QuestionC {

    public static int matchPattern(int[] a, int[] pattern) {
        int i = 0;
        int k = 0;
        int matches = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == pattern[k])
                matches++;
            else if (matches == 0 || k == pattern.length - 1)
                return 0;
            else {
                if (k != pattern.length - 1) {
                    k++;
                    i--;
                }
            }
        }
        if (i == a.length && k == pattern.length - 1)
            return 1;
        else
            return 0;
    }

}
