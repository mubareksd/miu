package miu_54;

public class QuestionC {

    public static int isFibonacci(int n) {
        if (n == 1)
            return 1;

        int fibonacci = 0;
        int fibo1 = 1;
        int fibo2 = 1;

        while (fibonacci < n) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        if (fibonacci == n)
            return 1;
        return 0;
    }
}
