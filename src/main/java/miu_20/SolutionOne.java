package miu_20;

public class SolutionOne {
    
    public static int sumFactor(int[] a) {

        if(a.length == 0) {
            return 0;
        }

        int sum = getSum(a);

        int count = 0;

        for(int i=0; i < a.length; i++) {
            if(a[i] == sum) {
                count++;
            }
        }

        return count;

    }

    static int getSum(int[] a) {
        int sum = 0;
        for(int i=0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
