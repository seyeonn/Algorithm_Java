package com.practice.Baekjoon.Realization;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BJ9076 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {

            int[] arr = new int[5];

            for (int j = 0; j < 5; j++) {
                arr[j] = scan.nextInt();
            }

            Arrays.sort(arr);

            if(arr[3]-arr[1] >= 4)
                System.out.println("KIN");
            else
                System.out.println(arr[1]+arr[2]+arr[3]);
        }
    }
}
