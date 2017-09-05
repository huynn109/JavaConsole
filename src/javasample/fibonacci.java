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
public class fibonacci {

    private static int calculateSumFibo(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        // Initialize result
        int sum = fibo[0] + fibo[1];

        // Add remaining terms
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            sum += fibo[i];
        }

        return sum;
    }

    private static int[] printFibo(int n) {
        if (n <= 0) {
            return null;
        }
        int[] fibo = new int[n + 1];

        fibo[0] = 0;
        fibo[1] = 1;

        // Add remaining terms
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo;
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println();
        int[] a = printFibo(n);
        if (a != null) {
            for (int i : a) {
                System.out.print(i + "  ");
            }
        } else {
            System.out.print(0);
        }
    }
}
