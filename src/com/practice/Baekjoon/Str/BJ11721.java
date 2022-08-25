package com.practice.Baekjoon.Str;

import java.util.Scanner;

public class BJ11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String word = scan.next();

		for(int i=0; i<word.length(); i++) {
			System.out.print(word.charAt(i));
			if(i%10 == 9)
				System.out.println();
		}
	}

}
