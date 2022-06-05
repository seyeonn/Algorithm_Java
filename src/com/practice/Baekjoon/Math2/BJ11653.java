package com.practice.Baekjoon.Math2;

import java.util.Scanner;

public class BJ11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 2;

        while(n != 1) {
        	if(n%i == 0) {
        		n /= i;
        		System.out.println(String.valueOf(i));
        	}
        	else
        		i++;
        }
	}

}