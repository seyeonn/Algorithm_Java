package com.practice.Baekjoon.Bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ7576 {
    static int M, N, ans = Integer.MIN_VALUE;
    static int[][] map;
    static Queue<Point> q;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        M = scan.nextInt();
        N = scan.nextInt();

        map = new int[N][M];
        q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = scan.nextInt();

                if(map[i][j] == 1)
                    q.add(new Point(i,j));
            }
        }

        bfs();

        L:for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 0) {
                    ans = -1;
                    break L;
                }
                ans = Math.max(ans, map[i][j]);
            }
        }

        System.out.println(ans == -1 ? -1 : ans-1);
    }
    private static void bfs() {
        // TODO Auto-generated method stub
        while(!q.isEmpty()) {
            Point cur = q.poll();
            int sr = cur.r;
            int sc = cur.c;

            for (int i = 0; i < dc.length; i++) {
                int nr = sr + dr[i];
                int nc = sc + dc[i];

                if(nr>=0 && nr<N && nc>=0 && nc<M && map[nr][nc] == 0) {
                    q.add(new Point(nr, nc));
                    map[nr][nc] = map[sr][sc] + 1;
                }
            }
        }

    }

}
