package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ11365 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {

            String s = scan.nextLine();
            StringBuffer sb = new StringBuffer(s);

            if(s.equals("END")){
                break;
            }

            System.out.println(sb.reverse());
        }
    }
}
