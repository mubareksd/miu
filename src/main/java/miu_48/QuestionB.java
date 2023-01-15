package miu_48;

import java.util.ArrayList;
import java.util.List;

public class QuestionB {

    public static int[] encodeNumber(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        if (n <= 1)
            return null;

        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n = n / i;
            }
        }

        if (n > 1)
            primeFactors.add(n);

        int[] a = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            a[i] = primeFactors.get(i);
        }
        return a;
    }
}
