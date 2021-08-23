package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ3985 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        int N = scan.nextInt();

        boolean[] cake = new boolean[L+1];

        int ex = Integer.MIN_VALUE;
        int person = Integer.MIN_VALUE;
        int eIndex = 0;
        int rIndex = 0;

        for (int i = 1; i <= N; i++) {
            int P = scan.nextInt();
            int K = scan.nextInt();

            if(ex < K - P + 1) {
                ex = (K - P + 1);
                eIndex = i;
            }

            int cnt = 0;
            for (int j = P; j <= K; j++) {
                if(cake[j] != false)
                    continue;
                cake[j] = true;
                cnt++;
            }

            if(person < cnt){
                person = cnt;
                rIndex = i;
            }
        }
        System.out.println(eIndex);
        System.out.println(rIndex);
    }

}
