package miu_46;

public class QuestionC {
    public static int[] filterArray(int[] a, int n) {

        int indexCount = 0;
        int digitIndex = 0;

        int[] temp = new int[a.length];

        while (n > 0) {
            if (n % 2 == 1) {
                temp[indexCount] = digitIndex;
                indexCount++;
            }
            n /= 2;
            digitIndex++;
        }

        int[] filtered = new int[indexCount];

        for (int i = 0; i < filtered.length; i++) {
            if (temp[i] > a.length - 1) {
                return null;
            }
            filtered[i] = a[temp[i]];
        }

        return filtered;

    }

}
