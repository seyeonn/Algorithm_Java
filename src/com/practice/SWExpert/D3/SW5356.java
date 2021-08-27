package com.practice.SWExpert.D3;

import java.util.Scanner;

public class SW5356 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {

            char[][] arr = new char[5][];
            int len = Integer.MIN_VALUE;
            for (int i = 0; i < 5; i++) {
                String s = scan.next();
                // 입력받은 길이마다 배열 생성
                arr[i] = new char[s.length()];
                for (int j = 0; j < s.length(); j++) {
                    arr[i][j] = s.charAt(j);
                }
                // 최대 길이 구하기
                len = Math.max(len, s.length());
            }

            System.out.print("#" + (t+1) + " ");
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < 5; j++) {
                    // (가변)해당 배열의 각 길이보다 인덱스가 작으면
                    // 즉, 해당 범위까지 출력
                    if(arr[j].length > i)
                        System.out.print(arr[j][i]);
                }
            }
        }
    }
}
