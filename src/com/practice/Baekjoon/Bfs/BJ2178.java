package com.practice.Baekjoon.Bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2178 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static class Point{
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

        N = scan.nextInt();
        M = scan.nextInt();

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = scan.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        visited[0][0] = true;
        bfs(0, 0);

        System.out.println(map[N-1][M-1]);
    }
    private static void bfs(int r, int c) {
        Queue<Point> q = new LinkedList<Point>();

        q.add(new Point(r, c));

        while(!q.isEmpty()) {
            Point cur = q.poll();
            int sr = cur.r;
            int sc = cur.c;

            for (int i = 0; i < dc.length; i++) {
                int nr = sr + dr[i];
                int nc = sc + dc[i];

                if(nr<0 || nr>=N || nc<0 || nc>=M)
                    continue;

                if(map[nr][nc] == 0 || visited[nr][nc])
                    continue;

                q.add(new Point(nr, nc));
                map[nr][nc] = map[sr][sc]+1;
                visited[nr][nc] = true;
            }
        }
    }


}
