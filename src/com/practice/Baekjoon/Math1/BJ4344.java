package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt();

        for (int t = 0; t < C; t++) {
            int N = scan.nextInt();
            int[] arr = new int[N];

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
                sum += arr[i];
            }

            double average = sum/N;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > average)
                    count++;
            }

            System.out.printf("%.3f", ((double)count/N)*100);
            System.out.println("%");
        }
    }
}
