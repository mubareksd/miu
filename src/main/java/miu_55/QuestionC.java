package miu_55;

public class QuestionC {
    static int is235Array(int[] a) {

        int sum = 0;
        int twos = 0;
        int threes = 0;
        int fives = 0;
        int non = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0)
                twos++;
            if (a[i] % 3 == 0)
                threes++;
            if (a[i] % 5 == 0)
                fives++;
            if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0)
                non++;

        }

        sum = twos + threes + fives + non;

        return sum == a.length ? 1 : 0;

    }

}
