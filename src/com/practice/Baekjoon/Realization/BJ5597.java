package com.practice.Baekjoon.Realization;

import java.util.Arrays;
import java.util.Scanner;

public class BJ5597 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean[] arr = new boolean[31];

        for (int i = 1; i < 29; i++) {
            arr[scan.nextInt()] = true;
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == false)
                System.out.println(i);
        }
    }
}
