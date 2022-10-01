package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ9086 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String str = scan.next();

            System.out.println(str.substring(0,1)+str.substring(str.length()-1, str.length()));
        }
    }
}
