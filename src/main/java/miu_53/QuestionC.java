package miu_53;

import java.util.Arrays;

public class QuestionC {
    public static int closestFib(int num) {

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        int closest = 0;

        for (int i = 1; i < num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n1 > closest && n1 <= num) {
                closest = n1;
            }

        }

        return closest;

    }

    // public static int closestFibonacci(int n) {

    // }

}
