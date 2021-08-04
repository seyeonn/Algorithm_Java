package com.practice.Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// N 과 M (8)
public class BJ15657 {
    static int[] arr;
    static int[] sel;
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[N];
        sel = new int[M];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int at, int depth) {
        if(depth == sel.length) {
            for (int i = 0; i <sel.length ; i++) {
                sb.append(sel[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i < N ; i++) {
                sel[depth] = arr[i];
                dfs(i, depth + 1);
            }
        }
    }


