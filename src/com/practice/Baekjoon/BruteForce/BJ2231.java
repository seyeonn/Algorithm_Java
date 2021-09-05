package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ2231 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int sum = 0;
        int temp = 0;

        for (int i = 0; i < N; i++) {
            sum = i;
            temp = i;

            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(sum == N){
                System.out.println(i);
                break;
            }
        }

        if(sum != N)
            System.out.println(0);
    }
}
