package mergeSortedArray;

public class MergeSortedArray {
    public static int[] mergeSortedArray(int[] a1, int[] a2) {
        int i = 0, j = 0, k = 0;
        int[] a3 = new int[a1.length + a2.length];
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j])
                a3[k++] = a1[i++];
            else
                a3[k++] = a2[j++];
        }

        while (i < a1.length)
            a3[k++] = a1[i++];

        while (j < a2.length)
            a3[k++] = a2[j++];

        return a3;
    }
}
