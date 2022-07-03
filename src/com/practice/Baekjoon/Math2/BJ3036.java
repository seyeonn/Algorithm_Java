package com.practice.Baekjoon.Math2;

import java.util.Scanner;

public class BJ3036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
		int n = scan.nextInt();
		int arr[] = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}

		int d = arr[0];

		for(int i=1; i<n; i++) {
			int gcd = gcd(d,arr[i]);
			int a = d/gcd;
			int b = arr[i]/gcd;
            System.out.println(a + "/" + b);
		}

	}

	public static int gcd(int d, int arr1) {
		if(d%arr1 == 0)
			return arr1;
		return gcd(arr1,d%arr1);
	}
}