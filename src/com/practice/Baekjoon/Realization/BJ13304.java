package com.practice.Baekjoon.Realization;

import java.util.Scanner;
// 방 배정
public class BJ13304 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 학생 수
        int K = scan.nextInt(); // 한 방에 배정할 수 있는 최대 인원 수

        int[] student = new int[N];

        int low = 0;
        int girl34 = 0;
        int boy34 = 0;
        int girl56 = 0;
        int boy56 = 0;

        for (int i = 0; i < N; i++) {
            int S = scan.nextInt(); // 성 - 0: 여, 1: 남
            int Y = scan.nextInt(); // 학년

            // 1학년 또는 2학년일 경우 성별 상관없이 배정 가능
            if (Y == 1 || Y == 2) {
                low++;
            } else { //3~6
                if (S == 0) {
                    if (Y == 3 || Y == 4)
                        girl34++;
                    else if (Y == 5 || Y == 6)
                        girl56++;
                } else if (S == 1) {
                    if (Y == 3 || Y == 4)
                        boy34++;
                    else if (Y == 5 || Y == 6)
                        boy56++;
                }
            }
        }
        int count = 0;

        low = low%K==0 ? low/K : low/K+1;
        girl34 = girl34%K==0 ? girl34/K : girl34/K+1;
        boy34 = boy34%K==0 ? boy34/K : boy34/K+1;
        girl56 = girl56%K==0 ? girl56/K : girl56/K+1;
        boy56 = boy56%K==0 ? boy56/K : boy56/K+1;
        count = low + girl34 + boy34 + girl56 + boy56;

        System.out.println(count);
    }
}
