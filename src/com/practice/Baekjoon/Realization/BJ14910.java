package com.practice.Baekjoon.Realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ14910 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int temp = Integer.MIN_VALUE;
		String ans = "Good";
		
		while(st.hasMoreTokens()) {
			
			int N = Integer.parseInt(st.nextToken());
			
			if(temp <= N) {
				temp = N;
				continue;
			}else {
				ans = "Bad";
				break;
			}
		}
		
		System.out.println(ans);
	}

}
