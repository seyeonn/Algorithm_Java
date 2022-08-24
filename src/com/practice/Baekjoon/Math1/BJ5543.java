package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] set = new int[5];

		for(int i=0; i<set.length; i++) {
			set[i] = scan.nextInt();
		}
		
		int min =2000;

		int drink = (set[3]<set[4]? set[3] :set[4]);

		for(int i=0; i<3; i++) {
			if(min>set[i])
				min = set[i];
		}

		int result = min + drink -50;
		System.out.println(result);

	}

}
