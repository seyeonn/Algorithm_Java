package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1859 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
            }

            int result = 0;
            int max = Integer.MIN_VALUE;
            for (int i = arr.length-1; i >= 0; i--) {
                if(max < arr[i]) {
                    max = arr[i];
                }

                // 첫 날이 가장 높으면 0
                if(max == arr[0])
                    result = 0;

                arr[i] = max - arr[i];
                result += arr[i];

            }
            System.out.printf("#%d %d \n", (t+1), result);
        }
    }
}
