package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2920 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = scan.nextInt();
        }

        String s = "";

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] + 1 == arr[i+1]) {
                s = "ascending";
            }else if(arr[i] -1 == arr[i+1]){
                s = "descending";
            }else {
                s = "mixed";
                break;
            }
        }

        System.out.println(s);
    }
}
