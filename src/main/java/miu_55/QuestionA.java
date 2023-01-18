package miu_55;

public class QuestionA {
    static int isTriangular(int n) {

        int i = 1;
        int sum = 0;

        while (n >= i) {
            sum += i;
            i++;
            if (n == sum) {
                return 1;
            }
        }

        return 0;

    }

}
