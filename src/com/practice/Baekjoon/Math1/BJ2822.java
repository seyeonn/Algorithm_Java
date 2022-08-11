package com.practice.Baekjoon.Math1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2822 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[8][2];

        for (int i = 0; i < 8; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = i+1;
        }

        Arrays.sort(arr, (a, b) -> {
            return b[0] - a[0];
        });

        int sum = 0;
        int[] ans = new int[5];

        for (int i = 0; i < 5; i++) {
            sum += arr[i][0];
            ans[i] = arr[i][1];
        }

        Arrays.sort(ans);

        System.out.println(sum);
        for (int i = 0; i < 5; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
