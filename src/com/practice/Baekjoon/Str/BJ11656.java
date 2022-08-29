package com.practice.Baekjoon.Str;

import java.util.Arrays;
import java.util.Scanner;

public class BJ11656 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String[] arr = new String[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.substring(i,str.length());
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
