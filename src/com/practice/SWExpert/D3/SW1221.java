package com.practice.SWExpert.D3;

import java.util.ArrayList;
import java.util.Scanner;

public class SW1221 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] word = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

        int T = scan.nextInt();
        scan.nextLine();

        for (int t = 0; t < T; t++) {
            String[] C = scan.nextLine().split(" ");
            int N = Integer.parseInt(C[1]);

            String[] list = scan.nextLine().split(" ");

            System.out.println("#" + (t+1));
            for (int j = 0; j < word.length; j++) {
                for (int i = 0; i < N; i++) {
                    if(list[i].equals(word[j])){
                        System.out.print(list[i]+" ");
                    }
                }
            }

        }
    }
}
