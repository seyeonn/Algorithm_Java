package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1978 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int count = 0;
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = scan.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                count++;
            }
        }

        System.out.println(count);
    }

}
