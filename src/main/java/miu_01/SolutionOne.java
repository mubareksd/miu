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
    
    public int isCentered(int[] array) {
        if (array == null || array.length % 2 == 0)
            return 0;
        int centerIndex = array.length / 2;
        int centerItem = array[centerIndex];
        for (int i = 0; i < array.length; i++) {
            if (i != centerIndex && centerItem >= array[i])
                return 0;
        }
        return 1;
    }
    
}
