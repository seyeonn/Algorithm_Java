package com.practice.Baekjoon.Math1;

import java.lang.Math;
import java.util.Scanner;

class BJ2609 {
     public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
       
        int min = Math.min(n,m);
        int a = 0;
        for(int i=1; i<=min; i++) {
            if(n%i == 0 && m%i == 0)
                a = i;
        }
        System.out.println(a);
        System.out.println(n*m/a);
    }
}