package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();

		int day;
		
		day = (v-b)/(a-b);
		if((v-b)%(a-b) != 0)
			day++;
		
		System.out.println(day);
	}

}
