package com.practice.Baekjoon.Queue;

import java.util.Scanner;

public class BJ2839 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if(N%5 == 0){
            System.out.println(N/5);
            return;
        }
        else {
            int f = N/5;

            for (int i = f; i >0 ; i--) {
                int t = N - (i*5);
                if(t%3 == 0) {
                    System.out.println(t / 3 + i);
                    return;
                }
            }
        }
        if(N%3==0){
            System.out.println(N/3);
        }else {
            System.out.println(-1);
        }
        return;
    }
}
