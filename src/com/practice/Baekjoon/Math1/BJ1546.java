package com.practice.Baekjoon.Math1;

import java.util.Scanner;

public class BJ1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double[] score = new double[n];

		for(int i=0; i<score.length; i++) {
			score[i] = scan.nextInt(); 
		}
		
		double max = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}

		double total =0; 
		for(int i=0; i<score.length; i++) {
			score[i] = (score[i]/max)*100;
			total += score[i];
		}

		double average = total/n;
		
		System.out.println(average);


	}

}
