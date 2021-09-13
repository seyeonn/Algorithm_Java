package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1977 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();

        int i=1;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while(true) {

            double p = Math.pow(i, 2);
            if(p >= M && p <= N) {
                sum += p;
                if(min > p)
                    min = (int)p;
            }

            if(p > N)
                break;

            i++;
        }

        if(sum != 0 && min != Integer.MAX_VALUE) {
            System.out.println(sum);
            System.out.println(min);
        }
        else
            System.out.println(-1);
    }
}

