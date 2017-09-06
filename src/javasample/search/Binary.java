/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample.search;

/**
 * Tìm kiếm nhị phân
 *
 * @author huyuit
 */
public class Binary {

    private static int search(int[] a, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int searchRecursive(int[] a, int low, int high, int key) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                return searchRecursive(a, low, mid - 1, key);
            } else {
                return searchRecursive(a, mid + 1, high, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 6, 8, 13, 44, 78};
//        int a2 = search(a, 0, a.length - 1, 8);
        int a2 = searchRecursive(a, 0, a.length - 1, 98);
        if (a2 >= 0) {
            System.out.print("Founded index: " + a2);
        } else {
            System.out.print("Not found");
        }

    }
}
