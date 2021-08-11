package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        for(char i='a'; i<'z'; i++){
            System.out.print(s.indexOf(i)+" ");
        }
    }
}
