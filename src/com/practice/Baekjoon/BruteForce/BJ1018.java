package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int min = 63;

		String bw = "BWBWBWBW";
		String wb = "WBWBWBWB";

		char[][] chess = new char[n][m];

		for(int i=0; i<n; i++) {
			String str = scan.next();
			for(int j=0; j<m; j++) 			
				chess[i][j] = str.charAt(j);
		}

		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				int bw_c = 0;
				int wb_c = 0;

				for(int x =i; x<i+8; x++) {
					int count1 = 0;
					int count2 = 0;

					for(int y =j; y<j+8; y++) {
						if(x % 2 == 1) {
							if(chess[x][y] != bw.charAt(count1++))
								bw_c++;
							if(chess[x][y] != wb.charAt(count2++))
								wb_c++;
						}
						else {
							if(chess[x][y] != wb.charAt(count1++))
								bw_c++;
							if(chess[x][y] != bw.charAt(count2++))
								wb_c++;
						}
					}
				}
				
				if(bw_c <= wb_c) {
					if(bw_c <= min)
						min = bw_c;
				}
				else {
					if(wb_c <= min)
						min = wb_c;
				}
			}
		}
		System.out.println(min);
		
	}
}


