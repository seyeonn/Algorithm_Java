package com.practice.SWExpert.D2;

import java.util.Scanner;

public class Clean1946 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int t=0; t<T; t++) {
            int n = scan.nextInt();
            int cnt = 0;
            String tmp="";

            for(int j=0; j<n; j++) {
                //string형으로 입력 받고 바로 char 형변환
            char a = scan.next().charAt(0);
            int b = scan.nextInt();

            //수 만큼 돌면서 cnt 증가, 문자열 첨가
                //cnt 갯수가 10으로 나누어 떨어지면 개행
                for(int i=0; i<b; i++) {
                    cnt++;
                    tmp += a;

                    if(cnt%10 == 0)
                        tmp += "\n";
                }

            }
            System.out.println(tmp);

        }
    }
}
