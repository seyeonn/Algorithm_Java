package com.practice.Baekjoon.Realization;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ2605 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = i+1;
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }

        for (int i = 1; i < arr2.length; i++) {
            int move = arr1[i];

            for (int j = i; j > i-arr2[i]; j--) {
                arr1[j] = arr1[j-1];
            }
            arr1[i-arr2[i]] = move;
        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }

}
