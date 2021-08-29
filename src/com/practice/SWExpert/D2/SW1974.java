package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1974 {
    static int[][] arr;
    static boolean[] flag;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            arr = new int[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            boolean flag = true;
            for (int i = 0; i < 9; i++) {
                if(!row(i)){
                    System.out.printf("#%d %d \n", (t+1), 0);
                    flag = false;
                    break;
                }
            }

            if(!flag)
                continue;

            for (int i = 0; i < 9; i++) {
                if(!col(i)){
                    System.out.printf("#%d %d \n", (t+1), 0);
                    flag = false;
                    break;
                }
            }

            if(!flag)
                continue;

            for (int i = 0; i <= 6; i+=3) {
                for (int j = 0; j <= 6; j+=3) {
                    if(!three(i, j)){
                        System.out.printf("#%d %d \n", (t+1), 0);
                        flag = false;
                        break;
                    }
                }
                if(!flag)
                    break;
            }

            if(!flag)
                continue;

            System.out.printf("#%d %d \n", (t+1), 1);

        }
    }

    private static boolean three(int i, int j) {
        flag = new boolean[10];
        int x = i+3;
        int y = j+3;
        for (int k = i; k < x; k++) {
            for (int l = j; l < y; l++) {
                if(flag[arr[k][l]]) {
                    return false;
                }
                flag[arr[k][l]] = true;
            }
        }
        return true;
    }

    private static boolean col(int i) {
        flag = new boolean[10];
        for (int j = 0; j < 9; j++) {
            if(flag[arr[j][i]]) {
                return false;
            }
            flag[arr[j][i]] = true;
        }
        return true;
    }

    private static boolean row(int i) {
        flag = new boolean[10];
        for (int j = 0; j < 9; j++) {
            if(flag[arr[i][j]]) {
                return false;
            }
            flag[arr[i][j]] = true;
        }
        return true;
    }

}
