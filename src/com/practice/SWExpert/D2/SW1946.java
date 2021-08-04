package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1946 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            char[] c = new char[N];
            int[] num = new int[N];

            for (int n = 0; n < N; n++) {
                c[n] = scan.next().charAt(0);
                num[n] = scan.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < num[i]; j++) {
                    System.out.print(c[i]);
                    count++;
                    if (count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
            }


        }
    }
}
