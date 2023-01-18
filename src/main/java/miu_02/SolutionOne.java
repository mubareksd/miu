package miu_02;

public class SolutionOne {
    static int f(int[] a) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                y += a[i];
            else
                x += a[i];
        }
        return x - y;
    }
}
