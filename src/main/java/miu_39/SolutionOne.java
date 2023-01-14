package miu_39;

public class SolutionOne {
    
    public static int isMinMaxDisjoint(int[] a) {

        if(a.length == 0 || a.length == 1) {
            return 0;
        }

        int max = a[0];
        int min = a[0];

        int countMax = 0;
        int countMin = 0;

        int indexMax = 0;
        int indexMin = 0;

        for(int i=0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min) {
                min = a[i];
            }
        }

        for(int i=0; i < a.length; i++) {
            if(a[i] == max) {
                indexMax = i;
                countMax++;
            }
            if(a[i] == min) {
                indexMin = i;
                countMin++;
            }
        }

        if(countMax > 1 || countMin > 1) {
            return 0;
        }

        if(indexMax - indexMin == 1 || indexMin - indexMax == 1) {
            return 0;
        }

        return 1;

    }

}
