package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2622 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int n = scan.nextInt();

        for (int i = 1; 0 < n-i; i++) {
            for (int j = i; j <= n-i-j; j++) {
                int l = n-i-j;
                if(i + j > l)
                    count++;
            }
        }

        System.out.println(count);
    }
}
