package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ10163 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N= scan.nextInt();
        int[][] arr = new int[1001][1001];

        for (int n = 1; n <= N; n++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int r = scan.nextInt();
            int c = scan.nextInt();

            // 위치가 겹치면 겹쳐진 색종이 인덱스로 덮기
            for (int i = x; i < x+r; i++) {
                for (int j = y; j < y+c; j++) {
                    arr[i][j] = n;
                }
            }
        }

        // 해당 위치에 저장된 인덱스 갯수 세기 (= 넓이 구하기)
        int[] res = new int[N+1];
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                if(arr[i][j] != 0){
                    res[arr[i][j]]++;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(res[i]);
        }

    }
}
