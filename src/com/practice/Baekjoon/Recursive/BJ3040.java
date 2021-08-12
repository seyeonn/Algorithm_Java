package com.practice.Baekjoon.Recursive;

import java.util.Arrays;
import java.util.Scanner;

public class BJ3040 {
    static int[] arr;
    static int[] seven;
    static int[] result;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        arr = new int[9];
        seven = new int[7];

        for (int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt();
        }

        cap(0,0);

        for (int i : result) {
            System.out.println(i);
        }
    }

    // 순서 상관없으므로 조합
    private static void cap(int cnt, int idx) {
        if(cnt == 7){
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += seven[i];
            }
            if(sum == 100) {
                result = Arrays.copyOf(seven, 7);
            }
            return;
        }

        for (int i = idx ; i < 9; i++) {
            seven[cnt] = arr[i];
            cap(cnt+1, i+1);
        }
    }


}
