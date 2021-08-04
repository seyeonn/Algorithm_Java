package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1284 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int t=0; t<T; t++) {
            int P = scan.nextInt();
            int Q = scan.nextInt();
            int R = scan.nextInt();
            int S = scan.nextInt();
            int W = scan.nextInt();

            int a = P*W;

            if(W>R)
                Q += (W-R)*S;

            System.out.printf("#%d %d \n", t+1, a<Q ? a: Q);


        }
    }
}
