package countOnes;

public class CountOnes {
    public static int countOnes(int n) {
        char[] a = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == 49)
                count++;
        return count;
    }
}
