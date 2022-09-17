package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ9325 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int s = scan.nextInt();
            int n = scan.nextInt();

            int sum = s;
            for (int i = 0; i < n; i++) {
                int q = scan.nextInt();
                int p = scan.nextInt();
                sum += p*q;
            }
            System.out.println(sum);
        }
    }
}
