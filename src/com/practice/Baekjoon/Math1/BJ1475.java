package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1475 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        int[] arr = new int[10];

        for(int i=0; i<N.length(); i++) {
            arr[N.charAt(i)-'0']++;
        }

        int set = 0;
        int sixNine = (arr[6] + arr[9])/2 + (arr[6]+arr[9])%2;

        for(int j=0; j<10; j++){
            if(j==6 || j==9)
                continue;
            //똑같은 수가 여러개 있으면 세트도 여러개 필요
            if(set < arr[j])
                set = arr[j];
        }


        if(set< sixNine)
            set = sixNine;

        System.out.println(set);
    }
}
