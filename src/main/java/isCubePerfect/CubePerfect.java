package isCubePerfect;

public class CubePerfect {
    public static int isCubePerfect(int[] a) {
        for (int i = 0; i < a.length; i++)
            if (Math.cbrt(a[i]) != (int) Math.cbrt(a[i]))
                return 0;
        return 1;
    }
}
