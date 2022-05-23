package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int count =1;
		int a =1;
		int b=1;
		int layer = 1;
		
		while(count<n) {
			if(layer%2 == 0) {
				if(b == 1) {
					layer++;
					a++;
					count++;
				}
				else {
					a++;
					b--;
					count++;
				}
			}
			else if(layer %2 ==1) {
				if(a ==1) {
					layer++;
					b++;
					count++;
				}
				else {
					a--;
					b++;
					count++;
				}
			}
		}
		System.out.println(a+"/"+b);
	}

}
