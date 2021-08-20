package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ10871 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int x = scan.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < x)
                System.out.print(arr[i] + " ");

        }
    }
}
