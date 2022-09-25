package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ5524 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String s = scan.next();
            System.out.println(s.toLowerCase());
        }
    }
}
