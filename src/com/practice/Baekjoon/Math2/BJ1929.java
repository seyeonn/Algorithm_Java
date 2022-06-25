package com.practice.Baekjoon.Math2;

import java.util.Scanner;

public class BJ1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();

		boolean[] check = new boolean[n+1];
		check[0] =true;
		check[1] =true;

		for(int i=2; i<=n; i++) {
			for(int j=2; i*j<=n; j++) {
				check[i*j] = true;
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(!check[i])
				System.out.println(i);
		}
	}

}