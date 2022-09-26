package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ5656 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String oper = "";
        int num = 0;

        while(!oper.equals("E")) {
            int a = scan.nextInt();
            oper = scan.next();
            int b = scan.nextInt();
            num++;
            if( !oper.equals("E")) {
                System.out.print("Case " + num + ": ");
            }
            switch (oper) {
                case ">" :
                    System.out.println(a > b);
                    break;
                case ">=" :
                    System.out.println(a >= b);
                    break;
                case "<" :
                    System.out.println(a < b);
                    break;
                case "<=" :
                    System.out.println(a <= b);
                    break;
                case "==" :
                    System.out.println(a == b);
                    break;
                case "!=" :
                    System.out.println(a != b);
                    break;
                default:
                    return;

            }
        }
    }
}
