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
public class Insertion {

    private static void sort(int[] a) { // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++) { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) { // (a[j] < a[j - 1])
//                int t = a[i];
//                a[i] = a[j];
//                a[j] = t;
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) { 
        int[] a = {12, 33, 42, 20, 23};
        show(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
