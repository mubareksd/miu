package sample_02;

public class SolutionOne {
    public static int f(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                sumEven += array[i];
            else
                sumOdd += array[i];
        }
        return sumOdd - sumEven;
    }
}
