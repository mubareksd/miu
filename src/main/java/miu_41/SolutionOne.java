package miu_41;

public class SolutionOne {

    public static int[] clusterCompression(int[] a) {

        if(a.length == 0) {
            return new int[]{};
        }

        int numClusters = 1;

        for(int i=0; i < a.length - 1; i++) {
            if(a[i] != a[i+1]) {
                numClusters++;
            }
        }

        int[] result = new int[numClusters];

        if(numClusters == 1) {
            result[0] = a[0];
            return result;
        }

        int currentIndex = 0;
        for(int i=0; i < a.length - 1; i++) {
            if(a[i] != a[i+1]) {
                result[currentIndex] = a[i];
                result[currentIndex + 1] = a[i + 1];
                currentIndex++;
            }
        }

        return result;

    }

}
