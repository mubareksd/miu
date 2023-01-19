package isLayered;

public class Layered {
    public static int isLayered(int[] a) {
        if (a.length <= 1)
            return 0;
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return 0;
            if (a[i] == a[i + 1])
                count++;

            if (a[i] != a[i + 1]) {
                if (count < 2)
                    return 0;
                count = 1;
            }
        }
        return 1;
    }
}