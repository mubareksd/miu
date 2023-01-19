package mum_58;

public class QuestionA {

    static int f(char[] a) {

        if (a == null)
            return -1;

        int sum = 0;

        // check if elements are digits
        // option1 - check the type of elment by using built in functions
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            if (Character.isDigit(a[i])) {
                int num = Integer.parseInt(String.valueOf(a[i]));
                sum += num * Math.pow(10, j);
            } else {
                return -1;
            }

        }

        return sum;

    }

}
