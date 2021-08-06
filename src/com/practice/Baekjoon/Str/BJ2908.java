package com.practice.Baekjoon.Str;

import java.util.Scanner;
// 상수
public class BJ2908 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        //String 문제 temp 변수 적극 활용
        //빈 문자열에 새 문자열 저장할 때
        String temp ="";

        for(int i=a.length()-1; i>=0; i--) {
            temp += a.charAt(i);
        }
        a = temp;

        temp ="";
        for(int i=b.length()-1; i>=0; i--) {
            temp += b.charAt(i);
        }
        b = temp;

        if(Integer.parseInt(a) > Integer.parseInt(b))
            System.out.println(a);
        else
            System.out.println(b);

    }
}
