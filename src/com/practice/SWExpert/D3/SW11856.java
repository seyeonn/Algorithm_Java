package com.practice.SWExpert.D3;

import java.util.Scanner;
// 반반
public class SW11856 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            String s = scan.next();

            int arr[] = new int[100];

            boolean search = false;
            for (int j = 0; j < s.length(); j++) {
                arr[s.charAt(j)-'0']++;
            }

            int cnt = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] != 0 && arr[j] == 2){
                    cnt++;
                }
            }

            if(cnt == 2)
                search = true;

            System.out.println("#" + (i+1) + " " + (search == true ? "Yes" : "No"));
        }
    }
}
