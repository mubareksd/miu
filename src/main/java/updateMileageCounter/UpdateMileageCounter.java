package updateMileageCounter;

public class UpdateMileageCounter {
    public static void updateMileageCounter(int[] a, int miles) {
        for (int i = 0; i < a.length && miles > 0; i++) {
            miles = a[i] + miles;
            if (miles > 9) {
                int tempMiles = miles % 10;
                miles /= 10;
                a[i] = tempMiles;
            } else {
                a[i] = miles;
                miles = 0;
            }
        }
    }
}