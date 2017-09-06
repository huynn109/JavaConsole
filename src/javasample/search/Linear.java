/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample.search;

/**
 * Tim kiếm tuyến tính.
 *
 * @author huyuit
 */
public class Linear {

    private static int searchKey(String[] a, String key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "hello how are you";
        String[] cs = a.split(" ");
        int a2 = searchKey(cs, "hello");
        if (a2 >= 0) {
            System.out.print(cs[a2]);
        } else {
            System.out.print("Not found");
        }

    }
}
