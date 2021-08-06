package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

// N 과 M (1)
// 중복되지 않은열 순
public class BJ15649 {
    static int[] arr;
    static boolean[] visited;
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[M];
        visited = new boolean[N];

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

        for (int i = 0; i < N ; i++) {
            if(visited[i] == false){
                visited[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
