package com.practice.Baekjoon.Math2;

import java.util.Scanner;

public class BJ1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for(int i=0; i<t; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();

			double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,  2));
			int r = r1+r2;
			int rab = Math.abs(r1-r2);

			if(x1==x2 && y1==y2) {
				if(r1==r2)
					System.out.println("-1");
				if(r1!=r2)
					System.out.println("0");
			}
			else {
				if(d == r || d == rab)
					System.out.println("1");
				if(r<d || d<rab)
					System.out.println("0");
				if(rab<d && d<r)
					System.out.println("2");
			}

		}
	}

}
