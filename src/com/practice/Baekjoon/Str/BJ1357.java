package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ1357 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();

        X = rev(X);
        Y = rev(Y);
        System.out.println(rev(X+Y));
    }

    private static int rev(int n) {
        String num = "";
        while(n>0) {
            num += n%10;
            n /= 10;
        }
        return Integer.parseInt(num);
    }
}
