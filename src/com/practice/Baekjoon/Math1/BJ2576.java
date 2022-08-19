package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2576 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            arr[i] = scan.nextInt();

            if(arr[i]%2 == 1) {
                sum += arr[i];

                if(min > arr[i])
                    min = arr[i];
            }
        }

        if(sum == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
