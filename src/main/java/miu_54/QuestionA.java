package miu_54;

public class QuestionA {
    static int isVesuvian(int n) {
        int count = 0;
        for (int i = 1; (i * i) < n; i++) {
            int sum1 = i * i;
            for (int j = 1; (j * j) < n; j++) {
                int sum2 = j * j;

                if (sum1 + sum2 == n) {
                    count++;
                    break;
                }
            }
            if (count >= 2)
                return 1;
        }
        return 0;
    }
}