package com.practice.Baekjoon.Math2;

import java.util.Scanner;

public class BJ2748 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        long[] fibo = new long[N+1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.println(fibo[N]);
    }
}
