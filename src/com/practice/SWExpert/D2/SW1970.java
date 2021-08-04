package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1970 {
    public static void main(String[] args) {
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        // 거스름돈 문제 나오면 배열 만들어서 풀기
        // + 주어진 예제가 많이 존재하는 경우 배열 만들어 풀기
        for(int t=0; t<T; t++) {
            int m = scan.nextInt();
            int[] arr2 = {0, 0, 0, 0, 0, 0, 0, 0};

            for(int i=0; i<arr.length; i++) {
                if(m >= arr[i]) {
                    arr2[i] += m/arr[i];
                    m -= (arr2[i]*arr[i]);
                }
            }

            for(int i=0; i<arr2.length; i++) {
                System.out.println(arr[i] + "원: " + arr2[i] + "개");
            }
        }
    }
}
