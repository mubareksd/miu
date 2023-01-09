package miu_12;

public class SolutionOne {
    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[] { 1, 1, 2, 1, 2, 4 }));
    }

    static int isSystematicallyIncreasing(int[] a) {

        int end = 1; // Track the end of the current sequence
        int index = 0; // Track the index of the array

        while (index < a.length) {

            // Iterate througha larger and larger subsequence
            for (int i = 1; i <= end; i++) {
                if (a[index] != i)
                    return 0;

                index++;
                if (index == a.length)
                    break;
            }

            end++;
        }

        return 1;
    }

}
