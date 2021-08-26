package com.practice.SWExpert.D3;

import java.util.Scanner;

public class SW2805 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();

            int[][] arr = new int[N][N];

            for (int i = 0; i < arr.length; i++) {
                String s = scan.next();
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = s.charAt(j)-'0';
                }
            }

            int sum = 0;
            for (int i = 0; i <= N/2; i++) {
                sum += arr[i][N/2];
                for (int j = 1; j <= i; j++) {
                    sum += arr[i][N/2-j];
                    sum += arr[i][N/2+j];
                }
            }

            for (int i = N/2+1; i < N; i++) {
                sum += arr[i][N/2];
                for (int j = 1; j < N-i; j++) {
                    sum += arr[i][N/2-j];
                    sum += arr[i][N/2+j];
                }
            }

            System.out.printf("#%d %d \n", (t+1), sum);
        }
    }
}
