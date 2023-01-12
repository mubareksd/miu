package miu_34;

public class SolutionOne {
    
    public static long isIsolated(long n) {

        if(n < 1 || n > 2097151) {
            return -1;
        }

        long square = n * n;
        long cube = n * n * n;

        while(square > 0) {
            long gots = square % 10;
            while(cube > 0) {
                long gotc = cube % 10;
                if(gotc == gots){
                    return 0;
                }
                cube = cube / 10;
            }
            square = square / 10;
        }

        return 1;

    }

}
