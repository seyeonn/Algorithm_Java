package com.practice.SWExpert.D3;

import java.util.Scanner;

public class SW6958 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int T = scan.nextInt();

            for (int t = 0; t < T; t++) {
                int N = scan.nextInt();
                int M = scan.nextInt();

                int[][] arr = new int[N][M];

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        arr[i][j] = scan.nextInt();
                    }
                }

                int max = Integer.MIN_VALUE;
                int count;
                int person = 0;
                for (int i = 0; i < N; i++) {
                    count = 0;
                    for (int j = 0; j < M; j++) {
                        if(arr[i][j] == 1){
                            count++;
                        }
                    }
                    if(count == max){
                        person++;
                    }
                    if(count > max){
                        max = count;
                        person = 1;
                    }
                }
                System.out.printf("#%d %d %d \n", (t+1), person, max);
            }
        }
}
