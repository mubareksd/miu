package reverseArray;

public class ReverseArray {
    public static int[] reverseArray(int[] a) {
        int[] aret = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++)
            aret[j] = a[i];
        return aret;
    }
}
