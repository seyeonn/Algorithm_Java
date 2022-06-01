package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			
			int x = n/h +1;
			int y = n%h;
			
			if(n%h == 0) {
				x = n/h;
				y = h;
			}
			System.out.println(100*y +x);
		}
		
	}

}
