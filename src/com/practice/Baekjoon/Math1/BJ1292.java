package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1292 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int[] arr = new int[1002];

        int count = 1;
        for (int i = 1; i <= 1000; i++) {
            for(int j=1; j<=i; j++) {
                if(count == 1001)
                    break;
                arr[count++] = i;
            }
        }

        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
