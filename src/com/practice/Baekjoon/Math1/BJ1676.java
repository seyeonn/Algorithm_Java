package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
		int n = scan.nextInt();
		int input;
		int count = 0;

		for(int i=1; i<=n; i++) {
			input = i;

			while(input % 2== 0 || input %5 == 0) {
				if(input % 2 == 0)
					input /= 2;
				if(input%5 == 0) {
					input /= 5;
					count++;
				}
			}
		}

        System.out.println(count);
	}

}