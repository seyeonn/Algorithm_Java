package com.practice.Baekjoon.Math1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ25305 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[arr.length-k]);
    }
}
