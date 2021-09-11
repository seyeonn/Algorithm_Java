package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ10797 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int d = scan.nextInt();

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if(scan.nextInt() == d)
                cnt++;
        }

        System.out.println(cnt);
    }
}
