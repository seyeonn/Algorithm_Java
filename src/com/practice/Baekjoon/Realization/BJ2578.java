package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2578 {
    public static void main(String[] args) {

        int[][] mine = new int[5][5];
        int[][] check = new int[5][5];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mine[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                check[i][j] = scan.nextInt();
            }
        }

        int count = 0;
        O:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ++count;
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if(mine[i][j] == check[k][l]) {
                            mine[i][j] = 0;
                        }
                    }
                }
                if(bingo(mine) >= 3){
                    break O;
                }
            }
        }
        System.out.println(count);
    }

    private static int bingo(int[][] mine) {
        int cnt = 0;
        int bingo = 0;

        // 행
        for (int i = 0; i < 5; i++) {
            cnt = 0;
            for (int j = 0; j < 5; j++) {
                if(mine[i][j] == 0)
                    cnt++;
            }
            if(cnt == 5)
                bingo++;
        }

        // 열
        for (int i = 0; i < 5; i++) {
            cnt = 0;
            for (int j = 0; j < 5; j++) {
                if(mine[j][i] == 0)
                    cnt++;
            }
            if(cnt == 5)
                bingo++;
        }

        // 대각선1
        cnt = 0;
        for (int i = 0; i < 5; i++) {
            if(mine[i][i] == 0)
                cnt++;
            if(cnt == 5)
                bingo++;
        }

        // 대각선2
        cnt = 0;
        for (int i = 0; i < 5; i++) {
            if(mine[i][mine.length-i-1] == 0)
                cnt++;
            if(cnt == 5)
                bingo++;
        }

        return bingo;
    }
}
