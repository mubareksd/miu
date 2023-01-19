package isDigitComplete;

public class DigitComplete {

    // second solution
    public static int isDigitComplete2(int[] a) {

        if (a == null || a.length < 10 || a.length > 10)
        return 0;

        for(int i=0; i < a.length; i++) {
            for(int j=i+1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    return 0;
                }
            }
        }

        return 1;

    }

    public static int isDigitComplete(int[] a) {
        if (a == null || a.length < 10 || a.length > 10)
            return 0;
        int j;
        for (int i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (i == a[j])
                    break;
            }
            if (j == a.length)
                return 0;
        }
        return 1;
    }
}
