package miu_49;

public class QuestionC {
    public static int decodeArray(int[] a) {

        int sign = 1;
        int encode = 0;

        if (a[0] < 0) {
            sign = -1;
        }

        for (int i = 0, j = a.length - 2; i < a.length - 1; i++, j--) {

            int num = Math.abs(a[i] - a[i + 1]); // 9
            int tens = (int) Math.pow(10, j); // 9
            encode += num * tens; // 50000 + 1000 + 800 + 30 + 9

        }

        return sign * encode;

    }

}
