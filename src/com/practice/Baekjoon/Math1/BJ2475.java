package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2475 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            sum += Math.pow(n, 2);
        }

        System.out.println(sum%10);
    }
}
