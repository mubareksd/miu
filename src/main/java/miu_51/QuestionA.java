package miu_51;

public class QuestionA {

    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[] { 1, 2, 19, 4, 5 }));
    }

    public static int isOnionArray(int[] a) {

        for (int j = 0, k = a.length - 1; j < a.length; j++, k--) {
            if(j != k) {
                if (a[j] + a[k] > 10) {
                    return 0;
                }
            }

        }

        return 1;

    }

}
