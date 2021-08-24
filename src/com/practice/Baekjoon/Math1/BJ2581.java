package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2581 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = M; i <= N; i++) {
            int count = 0;

            for (int j = 1; j <= i ; j++) {
                if(i%j == 0)
                    count++;
            }

            if(count == 2) {
                sum += i;
                if (min > i)
                    min = i;
            }
        }

        if(sum == 0)
            System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
