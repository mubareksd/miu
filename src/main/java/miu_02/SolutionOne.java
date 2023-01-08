/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miu_02;

/**
 *
 * @author mubareksd
 */
public class SolutionOne {
    public int sumOddEven(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                sumEven += array[i];
            else
                sumOdd += array[i];
        }
        return sumOdd - sumEven;
    }
}
