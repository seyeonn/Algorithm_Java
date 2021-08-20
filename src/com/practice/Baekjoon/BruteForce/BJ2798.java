package com.practice.Baekjoon.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = 0;
        int ans = 0;

        Arrays.sort(arr);

        for(int i=0; i<n; i++)
            for(int j=i+1; j<n; j++)
                for(int k=j+1; k<n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    // 카드 3장의 합이 m보다 작으면
                    if(sum <= m) {
                        // 그 수 중에서 가장 큰 값 구하기
                        if(ans <= sum)
                            ans = sum;
                    }
                }

        System.out.println(ans);
    }
}
