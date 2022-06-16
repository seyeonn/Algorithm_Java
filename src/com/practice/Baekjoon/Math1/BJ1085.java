package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();

		int vert = 0;
		int hori = 0;
		
		if(x>w/2)
			hori = Math.abs(w-x);
		else
			hori = x;
		
		if(y>h/2)
			vert = Math.abs(h-y);
		else
			vert = y;
		
		System.out.println(hori>vert ? vert: hori);

	}

}
