package com.practice.Baekjoon;

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

        Arrays.sort(arr);

        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
