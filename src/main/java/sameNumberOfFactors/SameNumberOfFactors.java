package sameNumberOfFactors;

public class SameNumberOfFactors {
    public static int getNumberOfFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;
        return count;
    }

    public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0)
            return -1;

        if (getNumberOfFactors(n1) == getNumberOfFactors(n2))
            return 1;

        return 0;
    }
}