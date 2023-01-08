/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miu_05;

/**
 *
 * @author mubareksd
 */
public class SolutionOne {

    public int[] f(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        if (first.length == 0 || second.length == 0) {
            return new int[0];
        }
        int min
                = (first.length < second.length) ? first.length : second.length;
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
}
