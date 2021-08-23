package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ2810 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        char[] p = scan.next().toCharArray();

        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if(i == 0)
                count++;
            if(p[i] == 'S')
                count++;
            if(p[i] == 'L'){
                i++;
                count++;
            }
        }

        for (int i = 0; i < p.length; i++) {
            if(p[i] != 'S')
                break;
            if(i == p.length-1)
                count -= 1;
        }
        System.out.println(count);
    }
}
