package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ2961_2 {
    static int N;
    static int min = Integer.MAX_VALUE;
    static int[][] taste;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        taste = new int[N][2];

        for (int i = 0; i < N; i++) {
            taste[i][0] = scan.nextInt();  // 신맛
            taste[i][1] = scan.nextInt();  // 쓴맛
        }

        dish(0, 1, 0, 0);

        System.out.println(min);
    }

    private static void dish(int idx, int a, int b, int cnt) {
        // 기저 조건
        if(idx == N) {
            // 신맛과 쓴맛의 차이
            int dif = Math.abs(a-b);

            if(cnt == 0)
                return;

            // 차이가 적은 수 구하기
            if(min > dif)
                min = dif;

            return;
        }

        // 조합
        dish(idx+1, a * taste[idx][0], b + taste[idx][1], cnt+1);
        dish(idx+1, a, b, cnt);
    }
}
