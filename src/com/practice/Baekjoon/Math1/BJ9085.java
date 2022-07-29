package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ9085 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i=0; i<T; i++) {
            int N = scan.nextInt();
            int[] arr = new int[N];
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = scan.nextInt();
                sum += arr[j];
            }

            System.out.println(sum);

        }
    }
}
