/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

/**
 *
 * @author huyuit
 */
public class Ex_1_1_7 {

    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("a. %.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.printf("b. %d\n", sum);

        sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.printf("c. %d\n", sum);
    }
}
