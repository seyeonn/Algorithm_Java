package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ2999 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int len = s.length();

        int r = 0;
        int c = 0;
        for (int i = 1; i < len; i++) {
            if(len%i== 0 && i <= len/i) {
                r = i;
                c = len/i;
            }
        }

        char[][] arr = new char[r][c];

        // idx활용 잘 하기
        int idx = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                arr[j][i] = s.charAt(idx++);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
            }
        }
    }
}
