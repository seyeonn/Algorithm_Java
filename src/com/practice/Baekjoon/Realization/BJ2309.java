package com.practice.Baekjoon.Realization;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2309 {
    static int[] tall;
    static int[] sel;
    static int count;
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        tall = new int[9];
        sel = new int[7];
        for (int i = 0; i < 9; i++) {
            tall[i] = scan.nextInt();
        }

        Arrays.sort(tall);

        count = 0;
        recursive(0,0);
    }

    private static void recursive(int idx, int cnt) {
        if(cnt == 7) {
            int sum = 0;
            for (int i = 0; i < sel.length; i++) {
                sum += sel[i];
                if(sum == 100) {
                    count++;
                    if(count >1)
                        return;
                    else {
                        for (int j = 0; j < sel.length; j++) {
                            System.out.println(sel[j]);
                        }
                    }
                }
            }
            return;
        }
        if(idx == 9)
            return;
        for (int i = idx; i < tall.length; i++) {
            sel[cnt] = tall[i];
            recursive(i+1, cnt+1);
        }
    }

}
