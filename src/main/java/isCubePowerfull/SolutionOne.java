package isCubePowerfull;

public class SolutionOne {

    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
    }

    static int isCubePowerful(int n) {

        if (n < 0)
            return 0;

        int k;
        int sum = 0;
        int num = n;

        while (num > 0) {
            k = num % 10;
            sum = sum + (k * k * k);
            num /= 10;
        }

        return sum == n ? 1 : 0;

    }

}
