/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

import static java.lang.Integer.toBinaryString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static javasample.LeetCode.reverse;

/**
 *
 * @author huyuit
 */
public class JavaSample {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            // Break for in not swap
            boolean swapped = false;
            // Because after loop -> Max value is last index => j < n - 1
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int binarySearch(int key, int[] a) { // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int[] numbers;
    private static int number;

    public static void main(String[] args) {
        int arr[] = {0, 2, 0, 35, 2, 45, 45};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int a = binarySearch(45, arr);
        if (a < 0) {
            System.out.println("Not found!");
        } else {
            System.out.println("Index founded: " + a);
        }
//
////        insertionSort(arr);//sorting array elements using bubble sort  
////        maxOne(989989898);
//        numbers = arr;
//        number = arr.length;
//        quicksort(0, number - 1);

//        boolean reverse = isPrime(5);
//        System.out.println("reverse " + reverse);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }
    }

    private static void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    // Tim day so 1 lon nhat tu binary: TechBash
    private static void maxOne(int i) {
        String binaryIntInStr = toBinaryString(i);
        System.out.println(binaryIntInStr);
        List<String> strings = Arrays.asList(binaryIntInStr.split("1"));
        List<String> strings1 = new ArrayList<>();
        strings1.addAll(strings);
        for (int j = 0; j < strings.size(); j++) {
            String s = strings.get(j);
            if (s == null || s.length() == 0) {
                strings1.remove(s);
            }
        }
        int k = 0;
        for (int j = 0; j < strings1.size(); j++) {
            if (strings1.get(j).length() > strings1.get(k).length()) {
                k = j;
            }
        }
        System.out.println(k + ": " + strings1.get(k));
    }
}
