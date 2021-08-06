package com.practice.SWExpert.D3;

import java.util.Scanner;

// 햄버거 다이어트
public class SW5215 {
    static int N,L;
    static int[] score;
    static int[] kcal;
    static int MAX_SCORE;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            N = scan.nextInt();  // 재료의 수
            L = scan.nextInt();  // 제한 칼로리

            score = new int[N];
            kcal = new int[N];

            for (int i = 0; i < N; i++) {
                score[i] = scan.nextInt();
                kcal[i] = scan.nextInt();
            }

            MAX_SCORE = 0;
            match(0, 0, 0);

            System.out.printf("#%d %d \n", t+1, MAX_SCORE);
        }
    }

    // (인덱스, 점수 합, 칼로리 합)
    private static void match(int idx, int sSum, int cSum) {
        // 칼로리 합이 제한 칼로리보다 큰 경우 검사 하지 않고 리턴
        if(cSum > L)
            return;

        // 기저 조건(종료 조건) - 인덱스가 끝까지 돌았을때
        if(idx == N){
            //최대 합 구하고 리턴
            if(MAX_SCORE < sSum )
                MAX_SCORE = sSum;
            return;
        }

        // 부분 집합 활용(powerSet)
        match(idx+1, sSum + score[idx], cSum + kcal[idx]);
        match(idx+1, sSum, cSum);

    }
}