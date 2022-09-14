package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ25304 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int won = scan.nextInt();
            int count = scan.nextInt();
            sum += won*count;
        }

        if(sum == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
