package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ13300 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] studentG = new int[7];
        int[] studentB = new int[7];

        for (int i = 0; i < N; i++) {
            int S = scan.nextInt();
            int Y = scan.nextInt();

            if(S == 0)  //여학생
                studentG[Y]++;
            else if(S == 1)
                studentB[Y]++;
        }

        int count = 0;
        for (int i = 1; i <= 6; i++) {
            if(studentG[i] <= K) {
                if(studentG[i] != 0)
                    count++;
            }
            else {
                count += (studentG[i]%K == 0 ? studentG[i]/K : studentG[i]/K+1);
            }

            if(studentB[i] <= K) {
                if(studentB[i] != 0)
                    count++;
            }
            else {
                count += (studentB[i]%K == 0 ? studentB[i]/K : studentB[i]/K+1);
            }

        }

        System.out.println(count);
    }

}
