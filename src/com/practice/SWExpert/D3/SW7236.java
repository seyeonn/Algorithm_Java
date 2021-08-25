package com.practice.SWExpert.D3;

import java.util.Scanner;
// 저수지의 의 총 깊이 구하기
public class SW7236 {
    static int[] dr = {-1, -1, -1, 1, 1, 1, 0, 0 };
    static int[] dc = {1, 0, -1, -1, 0, 1, -1, 1};
    static String[][] arr;
    static int N, ans;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            N = scan.nextInt();

            arr = new String[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scan.next();
                }
            }

            int count = 0;
            ans = Integer.MIN_VALUE;
            L:for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    count = check(i,j);
                    if(count == 0){
                        ans = 1;
                        break L;
                    }
                    //System.out.print(count+" ");
                    ans = Math.max(ans, count);
                }
            }

            System.out.printf("#%d %d \n",(t+1), ans);
        }
    }

    private static int check(int r, int c) {
        int cnt = 0;
        for (int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr >= 0 && nr<N && nc >= 0 && nc<N) {
                if(arr[nr][nc].equals("W")) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
