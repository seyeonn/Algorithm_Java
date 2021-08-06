package com.practice.Baekjoon.Str;

import java.util.Scanner;
// 그룹 단어 체커
public class BJ1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int cnt = 0;

        //String에서 char형으로 반환시
        //알파벳 소문자 꺼내오려면 s.charAt(i) - 97
        //알파벳 대문자 꺼내오려면 s.charAt(i) - 65

        //연속된 수나 문자 비교시 반복문 1부터 length까지 i-1, i 비교
        for(int i=0; i<n; i++) {
            String s = scan.next();
            boolean[] checker = new boolean[26];

            for(int j=1; j<s.length(); j++) {
                if(s.charAt(j-1) != s.charAt(j)){
                    if(checker[s.charAt(j)-97] == true){
                        cnt++; //그룹 단어가 아님.
                        break;
                    }
                    checker[s.charAt(j-1)-97] = true;
                }
            }
        }
        System.out.println(n-cnt);
    }
}
