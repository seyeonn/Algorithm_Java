package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ2744 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isLowerCase(c))
                System.out.print(String.valueOf(c).toUpperCase());
            else if(Character.isUpperCase(c))
                System.out.print(String.valueOf(c).toLowerCase());
        }

    }
}
