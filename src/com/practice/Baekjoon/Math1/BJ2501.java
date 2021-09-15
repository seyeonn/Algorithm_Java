package com.practice.Baekjoon.Math1;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ2501 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int idx = 0;
        for (int i = N; i >= 1; i--) {
            if(N%i == 0) {
                arr.add(N/i);
            }
        }

        if(arr.size() < K)
            System.out.println(0);
        else
            System.out.println(arr.get(K-1));

    }
}


