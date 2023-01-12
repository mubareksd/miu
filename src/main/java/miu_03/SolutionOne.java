package miu_03;

public class SolutionOne {
    public static char[] f(char[] a, int start, int len) {
        if (len < 0 || start < 0 || start + len - 1 >= a.length) {
            return null;
        }

        char[] sub = new char[len];
        for (int i = start, j = 0; j < len; i++, j++) {
            sub[j] = a[i];
        }

        return sub;
    }
}
