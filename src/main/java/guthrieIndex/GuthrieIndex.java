package guthrieIndex;

public class GuthrieIndex {

    public static int guthrieIndex(int n) {
        int count = 0;
        if (n > 1) {
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }
                count++;
            }
        }
        return count;
    }

}
