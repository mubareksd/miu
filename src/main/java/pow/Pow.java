package pow;

public class Pow {
    public static int pow(int n, int p) {
        int ret = n;
        for (int i = 2; i < p; i++)
            ret *= n;

        return ret;
    }
}
