package tech_b;

public class ExamC {

    public static void main(String[] args) {
        System.out.println(maxOccuringDigit(335547777));
    }

    static int maxOccuringDigit(int num) {

        String strnum = Integer.toString(num);

        int digit = 0;
        int maxOccur = 1;
        int tempCount = 1;

        for(int i=0; i < strnum.length(); i++) {
            for(int j=0; j < strnum.length(); j++) {
                if(strnum.charAt(i) == strnum.charAt(j)) {
                    tempCount++;
                }
            }
            if(tempCount > maxOccur) {
                maxOccur = tempCount;
                digit = Character.getNumericValue(strnum.charAt(i));
            }
            tempCount = 0;
        }

        return digit;

    }

}
