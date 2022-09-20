package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2525 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int min = 60 * A + B + C;
        int hour = (min/60) % 24;
        int mins = min % 60;

        System.out.println(hour + " " + mins);
    }
}
