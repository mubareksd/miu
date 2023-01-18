package miu_27;

public class SolutionOne {

    static int isNUnique(int[] a, int n) {
        int count = 0;
        if (a.length > 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] + a[j] == n) {
                        count++;
                        if (count > 1)
                            count = 0;
                    }
                }
            }
        }
        return count;
    }

}
