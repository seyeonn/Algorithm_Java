package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ3460 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            Integer n = scan.nextInt();
            String ans = Integer.toBinaryString(n);

            for (int i = ans.length()-1; i >= 0; i--) {
                if(ans.substring(i, i+1).equals("1"))
                    System.out.print(ans.length()-i-1+" ");
            }
        }
    }
}
