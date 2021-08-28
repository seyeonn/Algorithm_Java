package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ10157 {
    static int dr[] = {-1, 0, 1, 0};
    static int dc[] = {0, 1, 0, -1};
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt();
        int R = scan.nextInt();
        int K = scan.nextInt();  // 관객 대기번호

        int[][] arr = new int[R][C];
        boolean[][] check = new boolean[R+1][C+1];

        if(K > R*C){
            System.out.println(0);
            return;
        }

        int r = R-1;
        int c = 0;
        int dir = 0;
        for (int i = 0; i < R*C; i++) {
            arr[r][c] = i+1;
            r += dr[dir];
            c += dc[dir];

            if(r < 0 || r >= R || c < 0 || c >= C){
                r -= dr[dir];
                c -= dc[dir];

                dir = (dir+1)%4;

                r += dr[dir];
                c += dc[dir];
            }

            if(arr[r][c] != 0){
                r -= dr[dir];
                c -= dc[dir];

                dir = (dir+1)%4;

                r += dr[dir];
                c += dc[dir];
            }
        }

        int x = 0;
        int y = 0;
        L:for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == K){
                    y = R-i;
                    x = j+1;
                    break L;
                }
            }
        }

        System.out.println(x+" "+y);

    }
}
