package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		String temp = "";
		
		for(int i=0; i<t; i++) {
			int r = scan.nextInt();	
			String s = scan.next();

			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					temp += s.charAt(j);
				}
			}
			temp += "\n";
		}
		System.out.println(temp);
	}

}
