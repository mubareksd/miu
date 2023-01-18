package miu_55;

public class QuestionB {
    public static int isMercurial(int[] a) {

        boolean left1 = false;
        boolean right1 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3) {
                for (int j = 0; j < i; j++) {
                    if (a[j] == 1) {
                        left1 = true;
                    }
                }
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == 1) {
                        right1 = true;
                    }
                }
            }
        }

        return left1 == true && right1 == true ? 0 : 1;

    }

}
