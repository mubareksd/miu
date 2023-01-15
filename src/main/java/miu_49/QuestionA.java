package miu_49;

public class QuestionA {
    
    public static void doIntegerBasedRounding(int[] a, int n) {

        if(n <= 0) return;

        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 0) {
                int lower = (a[i] / n) * n;
                int upper = lower + n;
                int middle = n % 2 == 0 ? lower + n / 2 : (lower + n / 2) + 1;
                if(a[i] >= middle) {
                    a[i] = upper;
                }
                else {
                    a[i] = lower;
                }
            }
        }

    }

}
