package com.practice.Baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;
// 단어의 개수
public class BJ1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.println(st.countTokens());
        // 공백 기준으로 문자열의 단어 갯수 구할 때, StringTokenizer 사용
        //.countTokens()
    }
}
