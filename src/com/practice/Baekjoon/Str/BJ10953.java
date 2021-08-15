package com.practice.Baekjoon.Str;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10953 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i <n; i++) {
            String s = scan.next();
            StringTokenizer st = new StringTokenizer(s, ",");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a + b);
        }

    }

}
