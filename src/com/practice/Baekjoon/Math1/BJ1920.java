package com.practice.Baekjoon.Math1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1920 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int M = scan.nextInt();

//        - 시간 초과 -
//        for (int i = 0; i < M; i++) {
//            int num = scan.nextInt();
//            boolean check = false;
//            for (int j = 0; j < N; j++) {
//                if(num == arr[j])
//                    check = true;
//            }
//            System.out.println(check == true ? "1" : "0");
//        }

//       - 이분 탐색 -
        Arrays.sort(arr);

        for (int i = 0; i < M; i++) {
            if(binarySearch(scan.nextInt(), 0, N-1, arr) != -1)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }

    private static int binarySearch(int num, int start, int end, int[] arr) {

        if(start > end)
            return -1;

        int mid = (start+end)/2;

        if(arr[mid] == num)
            return mid;
        else if(arr[mid] > num)
            return binarySearch(num, start, mid-1, arr);
        else
            return binarySearch(num, mid+1, end, arr);
    }
}
