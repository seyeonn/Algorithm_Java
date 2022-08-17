package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ17094 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        String s = scan.next();
        int num = 0;
        int eng = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if(c == '2')
                num++;
            else if(c == 'e')
                eng++;
        }

        if(num > eng)
            System.out.println("2");
        else if(num < eng)
            System.out.println("e");
        else
            System.out.println("yee");
    }
}
