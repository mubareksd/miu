package miu_52;

public class QuestionC {
    public static int largestDifferenceOfEvens(int[] a) {
        boolean evenFlag = false;
        int largestDiff = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        evenFlag = true;
                        int diff = a[i] > a[j] ? a[i] - a[j] : a[j] - a[i];
                        largestDiff = diff > largestDiff ? diff : largestDiff;
                    }
                }
            }
            if (!evenFlag && i == a.length - 1)
                return -1;
        }

        return largestDiff;
    }
    
    public static int largestDifferenceOfEvens2(int[] a) {
        boolean evenFlag = false;
        int evenCount = 0;

        int minEven = a[0];
        int maxEven = a[0];

        for(int i=0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                evenFlag = true;
                minEven = a[i];
                maxEven = a[i];
                evenCount++;
            }
        }

        if(evenFlag == false || evenCount < 2) {
            return -1;
        }

        for(int i=0; i < a.length; i++) {

            if(a[i] % 2 == 0) {
                if(a[i] > maxEven) maxEven = a[i];
                if(a[i] < minEven) minEven = a[i];
            }

        }

        return maxEven - minEven;
    }
    
}
