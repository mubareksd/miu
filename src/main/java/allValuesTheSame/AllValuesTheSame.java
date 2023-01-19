package allValuesTheSame;

public class AllValuesTheSame {
    public static int allValuesTheSame(int[] a) {
        if (a.length == 0)
            return 0;

        for (int i = 0; i < a.length - 1; i++)
            if (a[i] != a[i + 1])
                return 0;

        return 1;
    }
}
