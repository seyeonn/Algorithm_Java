package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ2941 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0; i<cro.length; i++) {
            s = s.replace(cro[i], "a");
        }
        System.out.println(s.length());
    }
}
