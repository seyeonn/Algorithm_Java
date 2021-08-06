package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

// N 과 M (3)
// 중복을 허용하는 순열
public class BJ15651 {
    static int[] arr;
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[M];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == arr.length) {
            for (int i = 0; i <arr.length ; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N ; i++) {
                arr[depth] = i;
                dfs(depth+1);
            }
        }
    }

