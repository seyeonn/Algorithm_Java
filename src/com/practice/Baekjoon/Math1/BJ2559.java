package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2559 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] arr = new int[N];
        int[] result = new int[N-K+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int sum;
        for (int i = 0; i <= arr.length-K; i++) {
            sum = 0;
            for (int j = i; j < i+K; j++) {
                sum += arr[j];
            }
            result[i] = sum;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < result.length; i++) {
            if(max < result[i])
                max = result[i];
        }

        System.out.println(max);
    }

}
