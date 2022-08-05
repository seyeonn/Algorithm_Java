package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ11659 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N+1];

        for(int n=1; n<=N; n++) {
            arr[n] = scan.nextInt() + arr[n-1];
        }

        for(int m=0; m<M; m++) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            System.out.println(arr[j] - arr[i-1]);
        }

    }
}
