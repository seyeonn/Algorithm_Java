package com.practice.Baekjoon.Dfs;

import java.util.Scanner;

public class BJ1012 {
    static int M, N, K, cnt;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            M = scan.nextInt();
            N = scan.nextInt();
            K = scan.nextInt();

            map = new int[M][N];
            visited = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();

                map[a][b] = 1;
            }

            cnt = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if(!visited[i][j] && map[i][j] == 1) {
                        cnt++;
                        dfs(i, j);

                    }
                }
            }

            System.out.println(cnt);
        }
    }
    private static void dfs(int r, int c) {

        if(visited[r][c])
            return;

        visited[r][c] = true;

        for (int i = 0; i < dc.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr>=0 && nr<M && nc>=0 && nc<N && !visited[nr][nc] && map[nr][nc] == 1) {
                dfs(nr, nc);
            }
        }

    }


}
