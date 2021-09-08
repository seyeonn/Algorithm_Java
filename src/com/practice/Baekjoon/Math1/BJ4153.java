package com.practice.Baekjoon.Math1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ4153 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if(a == 0 && b == 0 && c == 0)
                break;

            int[] tri = {a, b, c};
            Arrays.sort(tri);

            if(tri[0]*tri[0] + tri[1]*tri[1] == tri[2]*tri[2])
                System.out.println("right");
            else
                System.out.println("wrong");

        }
    }
}
