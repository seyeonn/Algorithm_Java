package com.practice.Baekjoon.Math2;

import java.util.Scanner;

public class BJ4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		while(true) {
			int n = scan.nextInt();
			if(n ==0)
				break;

			boolean[] check = new boolean[n*2+1];
			check[0] = true;
			check[1] = true;
			
			int count =0;
			
			for(int i=2; i<=n*2; i++) {
				for(int j=2; i*j<=n*2; j++) {
					check[i*j] = true;
				}
			}
			
			for(int k=n+1; k<=2*n; k++) {
				if(!check[k])
					count++;
			}
			System.out.println(count);
		}
	}

}
