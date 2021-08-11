package com.practice.Baekjoon.Str;

import java.util.Scanner;
import java.util.Stack;

public class BJ9012_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            String s = scan.next();
            String result = VPS(s);
            System.out.println(result);

        }
    }
    private static String VPS(String s) {
        int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(c == '(') {
                    count++;
                }
                else if(c ==')'){
                    count--;
                }
                if(count <0)
                    return "NO";
            }
            if(count == 0)
                return "YES";
            else
                return "NO";
        }

}
