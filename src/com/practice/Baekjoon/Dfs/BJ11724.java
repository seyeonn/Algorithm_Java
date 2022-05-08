package com.practice.Baekjoon.Dfs;

import java.util.Scanner;

public class BJ11724 {
	static int N, M, cnt;
	static int[][] map;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		N= scan.nextInt();
		M = scan.nextInt();

		map = new int[1001][1001];
		visited = new boolean[1001];

		for (int i = 1; i <= M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			map[a][b] = map[b][a] = 1;
		}

		cnt = 0;

		for (int i = 1; i <= N ; i++) {
			if(!visited[i]) {
				dfs(i);
				cnt++;
			}
		}

		System.out.println(cnt);

	}
	private static void dfs(int n) {

		visited[n] = true;

		for (int i = 1; i <= N; i++) {
			if(map[n][i] == 1 && !visited[i]) {
				dfs(i);	
			}
		}

	}

}