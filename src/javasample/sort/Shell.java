/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample.sort;

import static javasample.sort.Selection.sort;
import static javasample.sort.Sort.exch;
import static javasample.sort.Sort.isSorted;
import static javasample.sort.Sort.less;
import static javasample.sort.Sort.show;

/**
 *
 * @author huyuit
 */
public class Shell {

    public static void sort(char[] a) { // Sort a[] into increasing order.
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
        }
        while (h >= 1) { // h-sort the array.
            for (int i = h; i < N; i++) { // Insert a[i] among a[i-h], a[i-2*h], a[i-3*h]... .
                for (int j = i; j >= h; j -= h) {
                    if (less(a[j], a[j - h])) {
                        exch(a, j, j - h);
                    }
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) { // Read strings from standard input, sort them, and print.
        String aString = "shellshortexample";
        char[] a = aString.toCharArray();
        show(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
