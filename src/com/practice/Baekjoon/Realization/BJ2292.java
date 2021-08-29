package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2292 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int start = 1;
        int i = 1;

        while(true) {
            if(N == 1){
                i = 1;
                break;
            }

            start += 6*i;

            i++;
            if(N <= start){
                break;
            }

        }

        System.out.println(i);
    }
}
