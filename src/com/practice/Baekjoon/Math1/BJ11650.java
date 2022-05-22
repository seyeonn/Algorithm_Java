package com.practice.Baekjoon.Math1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][2];

		for(int i=0; i<n; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}

		Arrays.sort(arr,(a,b) -> {
			if(a[0] == b[0]) {
				return Integer.compare(a[1], b[1]);
			}
			return Integer.compare((a[0]), (b[0]));
		});
		
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);

	}

}