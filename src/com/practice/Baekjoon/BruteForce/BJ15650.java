package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

// N 과 M (2)
// 중복되지 않은 조합
public class BJ15650 {
    static int[] arr;
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[M];

        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int at, int depth) {
        if(depth == arr.length) {
            for (int i = 0; i <arr.length ; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i < N ; i++) {
                arr[depth] = i+1;
                dfs(i+1, depth+1);
            }
        }
    }

