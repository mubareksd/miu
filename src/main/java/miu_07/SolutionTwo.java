package miu_07;

public class SolutionTwo {

    static int primeCount(int start, int end) {
        int count = 0;
        if (start < 2) {
            start = 2;
        }

        for (int i = start; i <= end; i++) {
            if (i == 2) {
                ++count;
                continue;
            }
            int flag = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                ++count;
            }
        }

        return count;
    }
}
