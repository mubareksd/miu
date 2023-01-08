/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miu_01;

/**
 *
 * @author mubareksd
 */
public class SolutionOne {

    public int isCentered(int[] a) {
        if (a == null || a.length % 2 == 0) {
            if (a == null || a.length % 2 == 0) {
                return 0;
            }
        }
        int midIndex = a.length / 2;
        int middleItem = a[midIndex];
        for (int i = 0; i < a.length; i++) {
            if (i != midIndex && middleItem >= a[i]) {
                return 0;
            }
        }
        return 1;
    }

}
