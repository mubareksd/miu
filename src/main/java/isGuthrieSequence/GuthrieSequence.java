package isGuthrieSequence;

public class GuthrieSequence {

    public static int isGuthrieSequence(int[] a) {

        if(a.length == 1 && a[0] != 1) {
            return 0;
        }

        if(a[a.length - 1] != 1) {
            return 0;
        }

        int k = 0;

        for(int i=0; i < a.length - 1; i++) {
            if(a[i] % 2 == 0) {
                k = a[i] / 2;
            }
            else {
                k = (a[i] * 3) + 1;
            }
            if(a[i+1] != k) {
                return 0;
            }
        }


        return 1;

    }
    
}
