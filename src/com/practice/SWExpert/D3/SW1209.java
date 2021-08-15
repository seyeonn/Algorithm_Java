package com.practice.SWExpert.D3;

import java.util.Scanner;

public class SW1209 {
    static int[][] arr;
    static int max;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {
            arr = new int[100][100];

            int T = scan.nextInt();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            max = Integer.MIN_VALUE;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
                if(max < sum)
                    max = sum;
                sum = 0;
            }


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[j][i];
                }
                if(max < sum)
                    max = sum;
                sum = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][i];
            }
            if(max < sum)
                max = sum;
            sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][arr.length - i -1];
            }
            if(max < sum)
                max = sum;

            System.out.printf("#%d %d \n", T, max);
        }
    }
}
