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
public class LeetCode {

    public static boolean isOdd(int i) {
//        return (i & 1) != 0;
         return (i % 2) != 0;
    }
    
    public static void main(String[] args) { 
        int a = -15;
        System.err.println("IsNagative: " + isOdd(a));
    }

    /**
     * Given an array of integers, every element appears twice except for one.
     * Find that single one.
     *
     */
    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int num = 0;

        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                num++;
            }
            n = n >> 1;
        }

        return num;

    }

    /**
     * Given a non-negative integer num, repeatedly add all its digits until the
     * result has only one digit. For example:Given num = 38, the process is
     * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     *
     * Follow up:Could you do it without any loop/recursion in O(1) runtime?
     *
     */
    public static int addDigits(int num) {

        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;

    }

    public static void moveZeroes(int[] nums) {
        int expand = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[expand] = nums[i];
                expand++;
            }
        }

        int start = expand;

        for (; start < nums.length; start++) {
            nums[start] = 0;
        }

    }

    /**
     * Reverse digits of an integer. Example1: x = 123, return 321 Example2: x =
     * -123, return -321
     *
     */
    public static int reverse(int x) {

        boolean isNegative = false;
        int m = 0;

        if (x < 0) {
            x = -x;
            isNegative = true;
        }

        while (x != 0) {
            //注意越界
            if (m > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            int temp = x % 10;
            x = x / 10;
            m = m * 10 + temp;
        }

        if (isNegative) {
            return -m;
        }
        return m;

    }
}
