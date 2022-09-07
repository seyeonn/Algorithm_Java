package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2953 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = 0;
        int idx = 0;
        int score = 0;
        for (int i = 0; i < 5; i++) {
            score = 0;
            for (int j = 0; j < 4; j++) {
                int n = scan.nextInt();
                score += n;
            }

            if(max < score) {
                max = score;
                idx = i+1;
            }
        }

        System.out.println(idx + " " + max);
    }
}
