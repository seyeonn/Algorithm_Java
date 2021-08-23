package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2567 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] arr = new int[101][101];
        int len = 0;

        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (arr[j][k] == 1)
                        continue;
                    arr[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i > 0 && i <= 100 && j > 0 && j <= 100 ) {
                    if (arr[i][j] == 1) {
                        if(arr[i][j-1] == 0)
                            len++;
                        if(arr[i+1][j] == 0)
                            len++;
                        if(arr[i][j+1] == 0)
                            len++;
                        if(arr[i-1][j] == 0)
                            len++;
                    }
                }
            }
        }

        System.out.println(len);
    }
}
