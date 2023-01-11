package miu_32;

public class SolutionOne {
    
    public static int isStacked(int n) {
        int sum = 0;
        for(int i=0; i <= n; i++) {
            sum += i;
            if(sum == n) {
                return 1;
            }
        }

        return 0;
    }

}
