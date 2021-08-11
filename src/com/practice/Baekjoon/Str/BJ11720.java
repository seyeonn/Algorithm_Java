package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String s = scan.next();
        char[] c = s.toCharArray();

        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i]-'0';
        }

        System.out.println(sum);
    }
}
