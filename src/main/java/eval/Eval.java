package eval;

public class Eval {
    public static double eval(double x, int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * Math.pow(x, i);
        }

        return sum;
    }
}