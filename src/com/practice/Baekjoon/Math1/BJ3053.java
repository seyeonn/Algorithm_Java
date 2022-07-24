package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ3053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();

		System.out.println(String.format("%.6f",(double)(r*r*Math.PI)));
		System.out.println(String.format("%.6f",(double)(r*r*2)));
	}

}
