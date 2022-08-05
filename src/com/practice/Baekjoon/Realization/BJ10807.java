package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ10807 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = scan.nextInt();
        }

        int v = scan.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] == v)
                count++;
        }

        System.out.println(count);
    }
}
