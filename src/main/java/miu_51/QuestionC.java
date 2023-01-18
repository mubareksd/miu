package miu_51;

public class QuestionC {

    static int[] encodeArray(int n) {

        if (n == 0) {
            return new int[] { 1 };
        }

        int size = n < 0 ? 1 : 0;
        int k = n < 0 ? -n : n;

        while (k > 0) {
            int ldigit = k % 10;
            k /= 10;
            size += ldigit + 1;
        }

        int[] result = new int[size];

        k = n < 0 ? -n : n;

        for (int i = 0; i < size; i++) {
            if (i == 0 && n < 0) {
                result[i] = -1;
                i++;
            }

            while (k > 0) {
                int ldigit = k % 10;
                k /= 10;
                for (int j = 0; j < ldigit; j++) {
                    result[i] = 0;
                    i++;
                }
                result[i] = 1;
                i++;
            }

        }

        return result;

    }

}
