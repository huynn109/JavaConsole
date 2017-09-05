/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample.sort;

import static javasample.sort.Sort.exch;
import static javasample.sort.Sort.isSorted;
import static javasample.sort.Sort.less;
import static javasample.sort.Sort.show;

/**
 *
 * @author huyuit
 */
public class Quick {

    private static int partition(int[] a, int low, int high) {
        int i = low;
        int j = high + 1;
        int v = a[low];
        while (true) {
            while (less(a[++i], v)) {
                if (i == high) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
    }

    private static void sort(int[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int j = partition(a, low, high);
        sort(a, low, j - 1);
        sort(a, j + 1, high);
    }

    public static void main(String[] args) { // Read strings from standard input, sort them, and print.
        int[] a = {12, 33, 42, 20, 23, 56, 9};
        show(a);
        sort(a, 0, a.length - 1);
        assert isSorted(a);
        show(a);
    }

}
