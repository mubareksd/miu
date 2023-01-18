package miu_25;

public class SolutionOne {

    static int henry(int i, int j) {
        int perf = 0;
        int count = 0;
        for (int k = 1;; k++) {
            int sum = 0;
            for (int l = 1; l < k; l++) {
                if (k % l == 0)
                    sum += l;
            }

            if (sum == k) {
                count++;
                if (count == i) {
                    perf += sum;
                } else if (count == j) {
                    perf += sum;
                    break;
                }
            }
        }
        return perf;
    }

}
