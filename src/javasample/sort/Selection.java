/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample.sort;

import javasample.StdOut;
import static javasample.sort.Sort.exch;
import static javasample.sort.Sort.isSorted;
import static javasample.sort.Sort.less;
import static javasample.sort.Sort.show;

/**
 *
 * @author huyuit
 */
public class Selection {

    public static void sort(int[] a) { // Sort a[] into increasing order.
        int N = a.length; // array length
        for (int i = 0; i < N; i++) { // Exchange a[i] with smallest entry in a[i+1...N).
            int min = i; // index of minimal entr.
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) { // Read strings from standard input, sort them, and print.
        int[] a = {12, 33, 42, 20, 23};
        show(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
