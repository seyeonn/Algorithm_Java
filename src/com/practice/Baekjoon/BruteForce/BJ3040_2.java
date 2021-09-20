package com.practice.Baekjoon.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BJ3040_2 {
    static int[] arr;
    static int[] sel;
    static int[] ans;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        arr = new int[9];
        sel = new int[7];

        for (int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt();
        }

        com(0, 0);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static void com(int idx, int cnt) {
        if(cnt == 7) {
            int sum = 0;

            for (int i = 0; i < sel.length; i++) {
                sum += sel[i];
            }

            if(sum == 100) {
                ans = Arrays.copyOf(sel, 7);
            }
            return;
        }

        if(idx == 9)
            return;

        sel[cnt] = arr[idx];
        com(idx+1, cnt+1);
        com(idx+1, cnt);
    }
}
