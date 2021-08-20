package com.practice.Baekjoon.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BJ11399 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        // 최소 경우를 만들기 위한 오름차순 정렬
        Arrays.sort(arr);

        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // 앞 인덱스 값과 누적
            arr[i] += arr[i-1];
            // 누적한 값 합계
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
