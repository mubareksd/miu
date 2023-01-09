package decodeArray;

public class SolutionOne {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[] { 0, 1, 1, 1, 1, 1, 0, 1 }));
    }

    static int decodeArray(int[] a) {

        int decodeNumber = 0;
        int Positive = 1;
        int zeroCount = 0;
        int ten = 1;

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                if (a[i] < 0) {
                    Positive = a[i];
                }
            }

            if (a[i] == 0) {
                zeroCount++;
            } else {
                if (zeroCount > 0) {
                    decodeNumber = decodeNumber * ten;
                    decodeNumber += zeroCount;
                    zeroCount = 0;
                    ten = 10;
                } else {
                    decodeNumber = decodeNumber * ten;
                    decodeNumber += 0;
                    ten = 10;
                }
            }

        }

        return decodeNumber * Positive;

    }

}
