package isSequencedArray;

public class SolutionOne {
    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{1,2,3,4,5}, 1, 5));
    }

    static int isSequencedArray(int[] a, int m, int n) {

        int b = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i + 1] - a[i] == 0) && a[0] == m && a[a.length - 1] == n) {
                b = 1;
            } else if ((a[i + 1] - a[i] == 1) && a[0] == m && a[a.length - 1] == n) {
                b = 1;
            } else {
                return 0;
            }
        }

        return b;

    }
}
