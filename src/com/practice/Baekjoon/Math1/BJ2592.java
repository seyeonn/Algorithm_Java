package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2592 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int[] count = new int[1001];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
            count[arr[i]]++;
            sum += arr[i];
        }

        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < 1001; i++) {
                if(max < count[i]) {
                    max = count[i];
                    maxIdx = i;
                }
        }

        System.out.println(sum/10 + "\n" + maxIdx);
    }
}
