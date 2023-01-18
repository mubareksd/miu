package miu_54;

public class QuestionB {

    static int isOneBalanced(int[] a) {
        int total1s = 0;
        int totalNon1s = 0;
        boolean non1Start = false;
        boolean non1End = false;
        if (a.length == 0)
            return 1;
        for (int number : a) {
            if (number == 1) {
                if (non1Start)
                    non1End = true;
                total1s++;
            } else {
                if (non1End)
                    return 0;
                non1Start = true;
                totalNon1s++;
            }
        }
        if (total1s != totalNon1s)
            return 0;
        return 1;
    }

    static int isOneBalanced2(int[] a) {

        int startOnes = 0;
        int endOnes = 0;
        int middleNonOnes = 0;

        // count how many ones are at the start
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1) {
                break;
            }
            startOnes++;
        }

        // count how many ones are at the end
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 1) {
                break;
            }
            endOnes++;
        }

        // check if ones exist in the middle
        for (int i = startOnes; i < a.length - endOnes; i++) {
            if (a[i] == 1) {
                break;
            }
            middleNonOnes++;
        }

        return startOnes + endOnes == middleNonOnes ? 1 : 0;

    }

}
