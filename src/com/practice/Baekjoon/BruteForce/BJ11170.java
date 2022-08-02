package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ11170 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();


        for (int i = 0; i < T; i++) {
            int num = 0;
            int N = scan.nextInt();
            int M = scan.nextInt();

            for(int j=N; j<=M; j++) {
                String S = Integer.toString(j);

                for(int s=0; s<S.length(); s++) {
                    if(S.substring(s, s+1).equals("0"))
                        num++;
                }
            }
            System.out.println(num);
        }


    }
}
