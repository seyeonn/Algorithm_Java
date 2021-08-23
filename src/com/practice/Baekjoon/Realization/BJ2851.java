package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2851 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int a = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            sum+= arr[i];

            if(sum <= 100) {
                a = (100-sum) < ((sum+arr[i+1])-100) ? sum : sum+arr[i+1];
            }
        }
        System.out.println(a);
    }
}
