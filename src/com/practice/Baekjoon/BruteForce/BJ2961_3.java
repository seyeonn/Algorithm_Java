package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ2961_3 {
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

        dish(0, 1, 0);

        System.out.println(min);
    }

    private static void dish(int idx, int a, int b) {
        // 기저 조건
        if(idx > 0) {
            // 신맛과 쓴맛의 차이
            int dif = Math.abs(a-b);

            // 차이가 적은 수 구하기
            if(min > dif)
                min = dif;
        }

        if(idx == N)
            return;

        // 조합
        for (int i = idx; i < N; i++) {
            dish(i+1, a * taste[i][0], b + taste[i][1]);
        }
    }
}
