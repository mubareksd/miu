package miu_56;

public class QuestionB {

    static int isMartian(int[] a) {

        int numOnes = 0;
        int numTwos = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                numOnes++;
            }
            if (a[i] == 2) {
                numTwos++;
            }
        }

        return numOnes > numTwos ? 1 : 0;

    }

}
