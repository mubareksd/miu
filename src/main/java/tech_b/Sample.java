package tech_b;

public class Sample {

    public static void main(String[] args) {
        // System.out.println(reverseString("robel"));
        // System.out.println(findMax(new int[] {  }));
        // System.out.println(findMin(new int[]{9,3,2,5,7,3,2}));
        // System.out.println(raiseNumber(5, 2));
        System.out.println(countCharacter("united states of america", 'a'));
    }

    static String reverseString(String str) {

        String reversed = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversed = ch + reversed;
        }

        return reversed;

    }

    static int findMax(int[] a) {

        if (a.length == 0) {
            return -1;
        }

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        return max;
    }

    static int findMin(int[] a) {
        if(a.length == 0) {
            return -1;
        }

        int min = a[0];

        for(int i=0; i < a.length; i++) {
            if(a[i] < min) min = a[i];
        }

        return min;

    }

    static int raiseNumber(int num, int pow) {

        int result = 1;

        while(pow != 0) {
            result *= num;
            pow--;
        }

        return result;

    }

    static int countCharacter(String str, char c) {

        int countCha = 0;
        
        for(int i=0; i < str.length(); i++) {
            if(str.charAt(i) == c) countCha++;
        }

        return countCha;

    }

}
