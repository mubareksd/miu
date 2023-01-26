package mum_58;

public class QuestionB {

    public static void main(String[] args) {
        System.out.println(f(new char[] { 'j', '2', 'k', '1' }));
    }

    public static int f(char[] a) {

        int score = 0;

        for (int i = 0; i < a.length; i++) {
            if (Character.isLetter(a[i])) {
                if (a[i] == 'j' || a[i] == 'q' || a[i] == 'x' || a[i] == 'z')
                    score += 10;
                else if (a[i] == 'k' || a[i] == 'v')
                    score += 5;
                else
                    score += 1;
            } else {
                score += 0;
            }
        }

        return score;

    }

}
