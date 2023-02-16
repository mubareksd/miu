package tech_b;

import java.util.Arrays;

public class ExamA {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(mergeArray(new int[] { -7, 12, 17, 29, 41, 56, 79 }, new int[] { -9, -3, 0, 5, 19 })));
    }

    static int[] mergeArray(int[] arrayA, int[] arrayB) {

        int i=0, j=0, k=0;

        int[] mergedArr = new int[arrayA.length + arrayB.length];

        while(i < arrayA.length && j < arrayB.length) {

            if(arrayA[i] < arrayB[j]) {
                mergedArr[k] = arrayA[i];
                i++;
                k++;
            }
            else {
                mergedArr[k] = arrayB[j];
                j++;
                k++;
            }

        }

        while(i < arrayA.length) {
            mergedArr[k] = arrayA[i];
            i++;
            k++;
        }

        while(j < arrayB.length) {
            mergedArr[k] = arrayB[j];
            j++;
            k++;
        }

        return mergedArr;

    }

}
