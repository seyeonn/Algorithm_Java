package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ10987 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;

        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        System.out.println(count);
    }
}
