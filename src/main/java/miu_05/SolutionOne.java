package miu_05;

import java.util.*;

public class SolutionOne {

    public static int[] f(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        if (first.length == 0 || second.length == 0) {
            return new int[0];
        }
        int min = (first.length < second.length) ? first.length : second.length;
        int[] a, b;
        if (min == first.length) {
            a = first;
            b = second;
        } else {
            a = second;
            b = first;
        }
        int[] c = new int[min];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                }
            }
        }
        int[] retArray = new int[k];
        for (int t = 0; t < retArray.length; t++) {
            retArray[t] = c[t];
        }
        return retArray;
    }

    static int[] f2(int[] first, int[] second) {
        List<Integer> newL = new ArrayList<>();
        if (first == null || second == null)
            return null;
        if (first.length == 0 || second.length == 0)
            return new int[0];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    newL.add(first[i]);
                    break;
                }
            }
        }
        int[] a = new int[newL.size()];
        for (int i = 0; i < newL.size(); i++) {
            a[i] = newL.get(i);
        }
        return a;
    }
}
