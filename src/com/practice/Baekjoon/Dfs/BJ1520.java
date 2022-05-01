package beakjoon;

import java.util.Scanner;

public class BJ1520 {
	static int M, N;
	static int[][] map, arr;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		M = scan.nextInt();
		N = scan.nextInt();

		map = new int[M+1][N+1];
		arr = new int[M+1][N+1];
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = scan.nextInt();
				arr[i][j] = -1;
			}
		}

		System.out.println(dfs(1,1));

	}
	private static int dfs(int r, int c) {
		
		if(r == M && c == N) {
			return 1;
		}
		if(arr[r][c] != -1) {
			return arr[r][c];
		}
		
		arr[r][c] = 0;
		
		for (int i = 0; i < dr.length; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if(nr >= 1 && nr <= M && nc >= 1 && nc <= N) {
				if(map[r][c] > map[nr][nc])
					arr[r][c] += dfs(nr,nc);
			}
		}

		return arr[r][c];
	}
}
