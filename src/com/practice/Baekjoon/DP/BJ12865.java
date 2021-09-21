package com.practice.Baekjoon.DP;

import java.util.Scanner;

public class BJ12865 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] weight = new int[N+1];
        int[] value = new int[N+1];

        for (int i = 1; i <= N; i++) {
            weight[i] = scan.nextInt();
            value[i] = scan.nextInt();
        }

        int[][] D = new int[N+1][K+1];

        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= K; w++) {
                if(weight[i] <= w) {
                    D[i][w] = Math.max(D[i-1][w], value[i] + D[i-1][w-weight[i]]);
                }
                else
                    D[i][w] = D[i-1][w];
            }
        }

        System.out.println(D[N][K]);
    }

}
