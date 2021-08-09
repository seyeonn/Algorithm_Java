package com.practice.SWExpert.D3;

import java.util.Scanner;

// 구구단 2
public class SW12221 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int A = scan.nextInt();
            int B = scan.nextInt();

            int result = (A>=10 || B>=10 ? -1 : A*B);
            System.out.println("#" + (t+1) + " " + result);

        }
    }
}
