package com.practice.Baekjoon.Dijkstra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ4485 {
    static int N;
    static int[][] map;
    static int[][] dis;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static class Point implements Comparable<Point> {
        int r;
        int c;
        int cost;  // 거리 계산

        Point(int r, int c, int cost){
            this.r = r;
            this.c = c;
            this.cost = cost;
        }

        // 오름차순 정렬
        public int compareTo(Point p) {
            return this.cost - p.cost;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan= new Scanner(System.in);

        int idx = 0;  // 테스트케이스
        while(true) {

            N = scan.nextInt();

            if(N== 0)
                break;

            idx++;
            map = new int[N][N];
            dis = new int[N][N];  // 최소 비용 저장

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = scan.nextInt();
                    dis[i][j] = Integer.MAX_VALUE;  // 초기값 지정
                }
            }

            dis[0][0] = map[0][0];   //초기값 지정
            bfs(0, 0);  // 0,0부터 탐색 (시작 좌표)

            System.out.println("Problem " + idx + ": " + dis[N-1][N-1]);
        }
    }
    private static void bfs(int r, int c) {
        // TODO Auto-generated method stub
        Queue<Point> q = new LinkedList<>();

        // 탐색할 좌표 저장
        q.add(new Point(r,c, map[r][c]));

        // 큐의 사이즈가 0이 될때까지 반복
        while(!q.isEmpty()) {
            // 현재 위치 뽑아오기
            Point cur = q.poll();
            int sr = cur.r;
            int sc = cur.c;

            // 사방 탐색
            for (int i = 0; i < dr.length; i++) {
                int nr = sr + dr[i];
                int nc = sc + dc[i];

                // 경계값 탐색 & 최소 경로 탐색 (기존의 가중치보다 적은 경우)
                if(nr>=0 && nr<N && nc>=0 && nc<N && dis[nr][nc] > dis[sr][sc] + map[nr][nc]) {
                    dis[nr][nc] = dis[sr][sc] + map[nr][nc];
                    q.add(new Point(nr, nc, dis[nr][nc]));
                }
            }
        }
    }

}
