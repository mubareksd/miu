package miu_29;

public class SolutionOne {
    
    public static int isLegalNumber(int[] a, int base) {

        for(int i=a.length - 1; i > 0; i--) {
            if(a[i] > base) {
                return 0;
            }

        }

        return 1;

    } 

}
