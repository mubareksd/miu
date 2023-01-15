package miu_42;

public class SolutionOne {
    
    public static int isRailroadTie(int[] a) {

        if(a.length == 1 || a[0] == 0 || a[a.length - 1] == 0) {
            return 0;
        }

        boolean found = false;

        for(int i=0; i < a.length; i++) {
            if(a[i] != 0) {
                found = true;
                break; 
            }
        }

        if(a.length == 2) {
            if(a[0] == 0 || a[1] == 0) {
                return 0;
            }
            if(a[0] != 0 && a[1] != 0) {
                return 1;
            }
            
        }

        if(found) {
            for(int i=1; i < a.length - 1; i++) {
                if(a[i] == 0 && a[i-1] == 0 && a[i+1] == 0) {
                    return 0;
                }
                if(a[i] != 0 && a[i-1] != 0 && a[i+1] != 0) {
                    return 0;
                }
            }
        }
        else {
            return 0;
        }

        return 1;

    }

}
