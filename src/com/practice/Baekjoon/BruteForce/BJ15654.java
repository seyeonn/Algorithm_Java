package com.practice.Baekjoon.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

// N 과 M (5)
public class BJ15654 {
    static int[] arr;
    static int[] sel;
    static boolean[] visited;
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[N];
        sel = new int[M];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == sel.length) {
            for (int i = 0; i <sel.length ; i++) {
                sb.append(sel[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N ; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                sel[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}

