package com.practice.Baekjoon.Str;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1427 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] ch = scan.next().toCharArray();

        Arrays.sort(ch);

        String temp = "";

        for (int i = 0; i <ch.length; i++) {
            temp += ch[i];
        }

        StringBuilder sb = new StringBuilder(temp);
        System.out.println(sb.reverse());

    }
}
