package com.practice.SWExpert.D1;

import java.util.Scanner;

public class SW2058 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;

        // 자릿수 더하기 문제
        while(n!=0) {
            sum += (n%10);
            n /= 10;
        }
        System.out.println(sum);
    }
}
