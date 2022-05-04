package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ17136 {

	static int ans = Integer.MAX_VALUE;
	static int[][] map = new int[10][10];
	static int[] papers = {0, 5, 5, 5, 5, 5};
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = scan.nextInt();
			}
		}

		dfs(map, 0);
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}
	private static void dfs(int[][] map, int cnt) {
		int sr = -1;
		int sc = -1;

		L:for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				if(map[r][c] == 1) {
					sr = r;
					sc = c;
					break L;
				}
			}
		}

		// 더이상 붙일 게 없으면
		if(sr == -1 && sc == -1) {
			ans = Math.min(ans, cnt);
			return; 
		}
		// 붙일 색종이 최대크기 얻기
		int size = getSize(sr, sc);

		// 색종이 붙이기
		for (int i = 1; i <= size; i++) {
			// 남은 색종이가 있다면
			if(papers[i] > 0) {
				// 색종이 붙이기
				for (int r = sr; r < sr + i; r++) {
					for (int c = sc; c < sc + i; c++) {
						map[r][c] = 0;
					}
				}
				papers[i]--;

				dfs(map, cnt+1);

				// 색종이를 붙이고 나면 다음 탐색을 위해
				// 붙였던 색종이 떼기
				for (int r = sr; r < sr + i; r++) {
					for (int c = sc; c < sc + i; c++) {
						map[r][c] = 1;
					}
				}
				papers[i]++;
			}
		}
	}
	private static int getSize(int sr, int sc) {
		int size = 5;
		while(size > 1) {
			boolean flag = false;
			L:for (int r = sr; r < sr + size; r++) {
				for (int c = sc; c < sc + size; c++) {
					if(r <0 || r>=10 || c<0 || c>=10 || map[r][c]!=1) {
						flag = true;
						break L;
					}

				}
			}
			if(!flag) {
				return size;
			}
			size--;
		}
		return 1;
	}

}


