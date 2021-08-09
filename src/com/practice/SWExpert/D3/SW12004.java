package com.practice.SWExpert.D3;

import java.util.Scanner;
// 구구단1
public class SW12004 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();

            boolean search = false;
            for(int i=1; i<=9; i++){
                for(int j=1; j<=9; j++){
                    if(i*j == N)
                        search = true;
                    break;
                }
            }

            System.out.println("#" + (t+1) + " " + (search == true ? "Yes" : "No"));
        }
    }
}
