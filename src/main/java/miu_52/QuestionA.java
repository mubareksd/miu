package miu_52;

public class QuestionA {
    public static int isSystematicallyIncreasing(int[] a) {
        int index = 0;
        int i = 0;
        do {
            for (int j = 1; j < i + 1; j++) {
                if (a[index] != j)
                    return 0;
                index++;
            }
            i++;
        } while (index < a.length);

        return 1;
    }
}