package com.practice.Baekjoon.Str;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1427_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] ch = scan.next().toCharArray();

        char temp;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length-1-i; j++) {
                if(ch[j] <ch[j+1]){
                    temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }


    }
}
