package com.practice.Baekjoon.Math1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2693 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {

            int[] arr = new int[10];

            for (int i = 0; i < 10; i++) {
                arr[i] = scan.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(arr[7]);
        }
    }
}
