package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ8958 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            String s = scan.next();
            int count = 0;
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'O') {
                    count++;
                    sum += count;
                }
                else if(s.charAt(i) == 'X'){
                    count = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
