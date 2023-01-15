package miu_47;

public class QuestionA {
    
    public static int largestAdjacentSum(int[] a) {

        if(a.length < 2) {
            return 0;
        }

        int largeAdj = a[0] + a[1];

        for(int i=0; i < a.length - 1; i++) {
            int adjSum = a[i] + a[i+1];
            if(adjSum > largeAdj) {
                largeAdj = adjSum;
            }
        }

        return largeAdj;

    }

}
