package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ8320 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int count = n;
        for (int i = 2; i <= n/2; i++) {
            // 중복되지 않도록 j인덱스를 i로 맞춰줌.
            for (int j = i; j <= n ; j++) {
                if(i*j <= n)
                    count++;
            }
        }

        System.out.println(count);
    }
}
