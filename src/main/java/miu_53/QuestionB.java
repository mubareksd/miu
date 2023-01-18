package miu_53;

public class QuestionB {

    static int areAnagrams(char[] a1, char[] a2) {

        if (!(a1.length == a2.length)) {
            return 0;
        }

        boolean missed = true;

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    missed = false;
                    break;
                }
            }
            if (missed == true) {
                return 0;
            }
            missed = true;
        }

        return 1;

    }

}
