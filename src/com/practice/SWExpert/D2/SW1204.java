package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1204 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int t=0; t<T; t++) {
            int  n = scan.nextInt();
            int[] sc = new int[101];
            int max = 0;
            int cnt = 0;

            for(int i=0; i<1000; i++) {
                int score = scan.nextInt();
                sc[score]++;
            }

            for(int i=0; i<sc.length; i++) {
                if(cnt <= sc[i])
                    cnt = sc[i];
            }

            //인덱스 저장
            for(int i=0; i<sc.length; i++) {
                if(cnt == sc[i]) {
                    if(max <= i)
                        max = i;

                }


            }
            System.out.printf("#%d %d \n", (t+1), max);;
        }
    }
}
