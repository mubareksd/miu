package miu_43;

public class SolutionOne {
    static int fullnessQuotient(int n) {
        if (n < 1)
            return -1;

        int count = 0;

        for (int base = 2; base <= 9; base++) {
            boolean zeroFlag = false;
            int number = n;
            while (number > 0) {
                System.out.println(number);
                if (number % base == 0) {
                    zeroFlag = true;
                    break;
                }
                number /= base;
            }
            if (!zeroFlag) {
                count++;
            }
        }
        return count;
    }

}
