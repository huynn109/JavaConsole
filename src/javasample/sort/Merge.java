/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample.sort;

import static javasample.sort.Selection.sort;
import static javasample.sort.Sort.isSorted;
import static javasample.sort.Sort.less;
import static javasample.sort.Sort.show;

/**
 *
 * @author huyuit
 */
public class Merge {

    private static int[] aux;

    public static void main(String[] args) { // Read strings from standard input, sort them, and print.
        int[] a = {12, 33, 42, 20, 23, 56, 9};
        aux = new int[a.length];
        show(a);
        sort(a, 0, a.length - 1);
        assert isSorted(a);
        show(a);
    }

    public static void merge(int[] a, int lo, int mid, int hi) { // Merge a[lo..mid] with a[mid+1..hi].
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
        {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
        {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    private static void sort(int[] a, int lo, int hi) { // Sort a[lo..hi].
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid); // Sort left half.
        sort(a, mid + 1, hi); // Sort right half.
        merge(a, lo, mid, hi); // Merge results (code on page 271).
    }
}
