package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ4470 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= N; i++) {
            System.out.println(i +". " + scan.nextLine());
        }
    }
}
