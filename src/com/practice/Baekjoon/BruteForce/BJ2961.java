package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ2961 {
    static int N;
    static int min = Integer.MAX_VALUE;
    static int[][] taste;
    static boolean[] visited;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        taste = new int[N][2];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            taste[i][0] = scan.nextInt();  // 신맛
            taste[i][1] = scan.nextInt();  // 쓴맛
        }
        
        dish(0);

        System.out.println(min);
    }

    private static void dish(int idx) {
        // 기저 조건
        if(idx == N) {
            int a = 1; // 신맛의 곱
            int b = 0; // 쓴 맛의 합
            int cnt = 0; // 재료의 갯수

            // 방문한 재료들의 곱과 합 구하기
            for (int i = 0; i < visited.length; i++) {
                if(visited[i]) {
                    cnt++;
                    a *= taste[i][0];
                    b += taste[i][1];
                }
            }

            // 재료가 없으면 반환
            if(cnt == 0)
                return;

            // 신맛과 쓴맛의 차이
            int dif = Math.abs(a-b);

            // 차이가 적은 수 구하기
            if(min > dif)
                min = dif;

            return;
        }

        // 부분 집합
        visited[idx] = true;
        dish(idx+1);
        visited[idx] = false;
        dish(idx+1);
    }
}
