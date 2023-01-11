package miu_26;

public class SolutionOne {

    public static int isDivisible(int[] a, int divisor) {

        for(int i=0; i < a.length; i++) {
            if(a[i] % divisor != 0) {
                return 0;
            }
        }

        return 1;

    }
    
}
