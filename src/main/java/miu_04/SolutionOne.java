/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miu_04;

/**
 *
 * @author mubareksd
 */
public class SolutionOne {

    public static int f(int n) {
        int sign = 1;
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
    }
}
