package com.practice.Baekjoon.Str;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10821 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        StringTokenizer st = new StringTokenizer(str, ",");
        int i = 0;

        while(st.hasMoreTokens()) {
            st.nextToken();
            i++;
        }
        System.out.println(i);
    }
}
