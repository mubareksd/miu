package miu_03;

public class SolutionOne {
    static char[] f(char[] a, int start, int len) {
        if (start < 0 || len < 0 || start + len - 1 >= a.length)
            return null;

        char[] sub = new char[len];
        for (int i = start, j = 0; j < len; i++, j++)
            sub[j] = a[i];

        return sub;
    }
}
