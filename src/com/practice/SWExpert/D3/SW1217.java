package com.practice.SWExpert.D3;

import java.util.Scanner;

public class SW1217 {
    static int N, M;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {
            int T = scan.nextInt();

            N = scan.nextInt();
            M = scan.nextInt();

            System.out.printf("#%d %d \n", T, recursive(1));
        }
    }

    private static int recursive(int i) {
        if(i == M)
            return N;
        return N * recursive(i+1);
    }
}
