package com.practice.Baekjoon.Recursive;

import java.util.Scanner;

public class BJ2741 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        solve(N);
    }

    private static void solve(int n) {
        if(n <= 0)
            return;
        solve(n-1);
        System.out.println(n);
    }
}
