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
public class Ex_1_1_5 {

    public static void printBetween0And1(double x, double y) {
        StdOut.printf("%f and %f both strictly between 0 and 1: %b\n",
                x, y,
                (x > 0.0) && (x < 1.0) && (y > 0.0) && (y < 1.0));
    }

    public static void main(String[] args) {
        printBetween0And1(0.3, 0.5);
        printBetween0And1(0.3, 1.5);
    }
}
