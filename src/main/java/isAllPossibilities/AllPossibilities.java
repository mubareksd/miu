package isAllPossibilities;

public class AllPossibilities {
    public static int isAllPossibilities(int[] a) {
        if (a.length <= 0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int anA : a) {
                if (anA == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        return 1;
    }
}