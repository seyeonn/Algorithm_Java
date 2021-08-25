package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2527 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            // 직사각형 1
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            // 직사각형 2
            int x3 = scan.nextInt();
            int y3 = scan.nextInt();
            int x4 = scan.nextInt();
            int y4 = scan.nextInt();

            String ans = "";
            if((x2 == x3 && y2 != y3) || (x1 != x4 && y1 == y4) || (x1 == x4 && y2 != y3) || (x2 != x3 && y1 == y4))
                System.out.println("b");
            else if((x2 == x3 && y2 == y3) || (x2 == x3 && y1 == y4) || (x1 == x4 && y2 == y3) || (x1 == x4 && y1 == y4))
                System.out.println("c");
            else if(x2 < x3 || y2 < y3 || x4 < x1 || y4 < y1)
                System.out.println("d");
            else
                System.out.println("a");

        }
    }
}
