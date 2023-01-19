package isDigitComplete;

public class DigitComplete {
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
