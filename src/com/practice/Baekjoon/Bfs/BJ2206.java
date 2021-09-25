package com.practice.Baekjoon.Bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
3차원 방문 배열 사용 이유 : 벽을 부수고 이동했을 경우의 map과 벽을 부수지 않고 이동했을 경우의 map을 구별하기 위함.
 */

public class BJ2206 {
    static int N, M, cnt, ans = Integer.MAX_VALUE;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static class Point {
        int r;
        int c;
        int puk;

        public Point(int r, int c, int puk) {
            this.r = r;
            this.c = c;
            this.puk = puk;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N= scan.nextInt();
        M = scan.nextInt();

        map = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            String s = scan.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j)-'0';
            }
        }

        cnt = 1;
        bfs();

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);

    }

    private static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, 0, 0));
        visited[0][0][0] = true;

        while(!q.isEmpty()) {
            int size = q.size();
            for (int l = 0; l < size; l++) {
                Point cur = q.poll();
                int sr = cur.r;
                int sc = cur.c;

                // 최종 위치 도달했을 때
                if (sr == N - 1 && sc == M - 1) {
                    // 최단 거리 구하기
                    ans = Math.min(ans, cnt);
                    return;
                }

                // 사방 탐색
                for (int i = 0; i < dr.length; i++) {
                    int nr = sr + dr[i];
                    int nc = sc + dc[i];

                    // 경계값 탐색
                    if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                        // 벽을 한 번 부순 경우 + 벽을 만나지 않았을 경우
                        if (map[nr][nc] == 0 && cur.puk == 1 && !visited[nr][nc][1]) {
                            visited[nr][nc][1] = true;
                            q.offer(new Point(nr, nc, cur.puk));
                        }
                        // 벽을 부수지 않은 경우 + 벽을 만났을 경우
                        else if (map[nr][nc] == 1 && cur.puk == 0 && !visited[nr][nc][1]) {
                            visited[nr][nc][1] = true;
                            q.add(new Point(nr, nc, cur.puk + 1));
                        }
                        // 벽을 부수지 않은 경우 + 벽을 만나지 않았을 경우 = 최종 도달까지 벽을 만나지 않을 경우를 위해 3차원 탐색
                        else if(map[nr][nc] == 0 && cur.puk == 0 && !visited[nr][nc][0]) {
                            visited[nr][nc][0] = true;
                            q.offer(new Point(nr, nc, cur.puk));
                        }
                    }
                }
            }
            cnt++;
        }
    }
}
