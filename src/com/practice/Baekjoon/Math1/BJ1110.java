package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int count = 1;

		int a = num%10;
		int b = num/10;

		int c = (b+a)%10;
		int r = (10*a)+ c;

		while(r!= num) {
			int temp = r;	
			a = temp%10;
			b = temp/10;

			c = (b+a)%10;
			r = (10*a)+ c;

			++count;
		}
		System.out.println(count);
	}

}
