package miu_46;

import java.util.Arrays;

public class QuestionC {
    
    public static void main(String[] args) {
        // System.out.println(filterArray(new int[]{}, 88));
        System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88)));
    }

    public static int[] filterArray(int[] a, int n) {

        int indexCount = 0;
        int digitIndex = 0;

        int[] temp = new int[a.length];

        while(n > 0) {
            if(n % 2 == 1) {
                temp[indexCount] = digitIndex;
                indexCount++;
            }
            n /= 2;
            digitIndex++;
        }

        int[] filtered = new int[indexCount];

        for(int i=0; i < filtered.length; i++) {
            if(temp[i] > a.length - 1) {
                return null;
            }
            filtered[i] = a[temp[i]];
        }

        return filtered;

    }

}
