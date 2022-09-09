package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2506 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int score = 0;
        int idx = 1;
        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();

            if(num != 0){
                score += idx++;
            }else {
                idx = 1;
            }
        }

        System.out.println(score);
    }
}
