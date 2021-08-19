package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ3052 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            int n = scan.nextInt();
            arr[n%42]++;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0)
                count++;
        }

        System.out.println(count);
    }
}
