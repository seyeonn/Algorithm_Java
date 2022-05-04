package com.practice.Baekjoon.Bfs;

import java.util.Scanner;

public class BJ10026 {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static char[][] arr;
    static boolean[][] visited;
    static int N, cnt1, cnt2;
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        arr = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = scan.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        // 적록색약이 아닌 사람과 적록색약인 사람 2가지 경우
        // 적록색약 - R과 G 구분X

        // 1. 적록색약이 아닌 사람
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    cnt1++;
                    dfs(i, j);
                }
            }
        }

        // 방문 배열 초기화 필요
        visited = new boolean[N][N];

        // 적록색약 - R과 G 구분X = 통일시켜줌
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j] == 'R')
                    arr[i][j] = 'G';
            }
        }

        // 2. 적록색약인 사람
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    cnt2++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(cnt1 + " " + cnt2);
    }
    private static void dfs(int r, int c) {

        visited[r][c] = true;

        for (int i = 0; i < dc.length; i++) {
            // 사방 검색
            int nr = r + dr[i];
            int nc = c + dc[i];

            // 인접 구역과 현재 구역의 색이 같고, 인접구역을 방문하지 않았으면
            if(nr>=0 && nr<N && nc>=0 && nc<N && arr[nr][nc] == arr[r][c]) {
                if(!visited[nr][nc])
                    dfs(nr,nc);
            }
        }
    }
}
