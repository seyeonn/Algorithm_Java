package com.practice.Baekjoon.GreedyAlgorithm;

import java.util.Scanner;

public class BJ5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int price = scan.nextInt();
		int money = 1000-price;
		int count = 0;
		int n = 0;

		int[] en = {500, 100, 50, 10, 5, 1};
		
		while(true) {
			if(money ==0)
				break;
			
			int sub = money/en[n];
			if(sub!= 0) {
				count += sub;
				money -= en[n] * sub;
			}
			n++;
		}
		System.out.println(count);
	}

}
