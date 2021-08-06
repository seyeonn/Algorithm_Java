package com.practice.SWExpert.D4;

import java.util.Scanner;

// 정사각형 방
public class SW1861 {
    static int N, room, count;
    static int[][] arr;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            N = scan.nextInt();
            arr = new int[N][N];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            room = Integer.MAX_VALUE;
            count = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    change(1, i, j, arr[i][j]);
                }
            }

            System.out.printf("#%d %d %d \n", t+1, room, count);
        }
    }

    public static void change(int cnt, int r, int c, int k) {

        for(int i=0; i<4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr>=0 && nr<N && nc>=0 && nc<N && arr[nr][nc] == arr[r][c]+1){
                change(cnt+1, nr, nc, k);
            }
        }

        if(count < cnt){
            count = cnt;
            room = k;
        }
        else if(count == cnt){
            if(room > k)
                count = cnt;
                room = k;
        }
    }
}
