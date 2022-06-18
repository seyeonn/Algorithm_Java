package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			System.out.println(fibo(k,n));
		}
		
	}
	
	static int fibo(int k, int n) {
		if(n==0)
			return 0;
		else if(k==0)
			return n;
		else
			return fibo(k,n-1) +fibo(k-1,n);
	}

}
