package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1948 {
    public static void main(String[] args) {
        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int t=0; t<T; t++) {
            int m1 = scan.nextInt();
            int d1 = scan.nextInt();
            int m2 = scan.nextInt();
            int d2 = scan.nextInt();

            //날짜 구하기
            int d = d2-d1 +1;

            for(int i = m1; i<m2; i++) {
                d += date[i-1];
            }

            System.out.println(d);
        }
    }
}
