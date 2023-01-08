/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miu_03;

/**
 *
 * @author mubareksd
 */
public class SolutionOne {

    public char[] f(char[] a, int start, int len) {
        if (len < 0 || start < 0 || start + len - 1 >= a.length) {
            return null;
        }

        char[] sub = new char[len];
        for (int i = start, j = 0; j < len; i++, j++) {
            sub[j] = a[i];
        }

        return sub;
    }
}
