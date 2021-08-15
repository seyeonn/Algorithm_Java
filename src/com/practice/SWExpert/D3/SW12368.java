package com.practice.SWExpert.D3;

import java.util.Scanner;

public class SW12368 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            int time = a+b;

            if(time >= 24){
                if(time%24 == 0){
                    time = 0;
                }
                else {
                    time = (a+b)%24;
                }
            }

            System.out.printf("#%d %d \n", (t+1), time);
        }
    }
}
