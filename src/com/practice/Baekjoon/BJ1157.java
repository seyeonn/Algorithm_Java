package com.practice.Baekjoon;

import java.util.Scanner;
// 단어 공부
public class BJ1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next().toUpperCase();

        int[] arr = new int[26];

        int max = 0;
        char result = '?';

        for(int i=0; i<s.length(); i++) {
            int al = s.charAt(i) -65;
            arr[al]++;

            if(max < arr[al]) {
                max = arr[al];
                result = s.charAt(i);
            }
            else if(max == arr[al]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
