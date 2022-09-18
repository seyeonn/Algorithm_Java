package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ3058 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int[] arr = new int[7];
            int sum = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 7; i++) {
                arr[i] = scan.nextInt();
                if(arr[i]%2 == 0) {
                    sum += arr[i];
                    if(min > arr[i]){
                        min = arr[i];
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
