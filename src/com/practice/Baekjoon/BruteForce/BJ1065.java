package com.practice.Baekjoon.BruteForce;

import java.util.Scanner;

public class BJ1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 0;

		for(int i=1; i<=n; i++) {
			if(check(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	static boolean check(int n) {
		boolean result = false;
		if(n<100)
			result = true;
		else if(n>=100 && n<1000) {
			int f = (n/100)-(n%100)/10;
			int s = (n%100)/10 - n%10;
			if(f == s)
				result = true;
		}
		return result;
	}

}
