package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ11098 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int p = scan.nextInt();
            String[][] arr = new String[p][2];

            for (int i = 0; i < p; i++) {
                arr[i][0] = scan.next();
                arr[i][1] = scan.next();
            }

            int max = Integer.MIN_VALUE;
            int idx = 0;
            for (int i = 0; i < p; i++) {
                if(max < Integer.parseInt(arr[i][0])){
                    max = Integer.parseInt(arr[i][0]);
                    idx = i;
                }
            }

            System.out.println(arr[idx][1]);
        }
    }
}

