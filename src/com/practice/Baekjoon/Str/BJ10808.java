package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ10808 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // 'a' =97, 'A' = 65
            arr[s.charAt(i)-97]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
