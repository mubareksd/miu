package tech_b;

public class ExamB {
    
    public static void main(String[] args) {
        System.out.println(isCenteredIncreasing(new int[]{4,3,3,4,5,6}));
    }

    // 1,2,3,4,5,6

    static int isCenteredIncreasing(int[] a) {

        if(a.length % 2 != 0) return 0;

        int midIndex = (a.length / 2) - 1;
        int midSum = a[midIndex] + a[midIndex + 1];

        for(int i=midIndex -1, j=a.length - midIndex; i >= 0; i--, j++) {
            int adjusentSum = a[i] + a[j];
            if(midSum < adjusentSum) {
                midSum = adjusentSum;
            }
            else {
                return 0;
            }
        }

        return 1;

    }

}
