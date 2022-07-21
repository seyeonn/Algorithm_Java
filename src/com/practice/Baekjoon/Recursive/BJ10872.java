package com.practice.Baekjoon.Recursive;

import java.util.Scanner;

public class BJ10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.println(result(n));
	}

	static int result(int n) {
		if(n==1 || n==0) return 1;
		return n * result(n-1);
	}

}
