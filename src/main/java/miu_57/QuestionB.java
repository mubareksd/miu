package miu_57;

public class QuestionB {
    
    public static int isDaphneArray(int[] a) {

        if(a.length == 1) {
            return 1;
        }

        for(int i=0; i< a.length-1; i++) {
            if(a[i] < 0 && a[i+1] < 0) return 0;
            if(a[i] > 0 && a[i+1] > 0) return 0;
        }

        return 1;

    }

}
