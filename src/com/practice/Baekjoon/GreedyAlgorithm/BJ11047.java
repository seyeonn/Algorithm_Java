package com.practice.Baekjoon.GreedyAlgorithm;

import java.util.Scanner;

public class BJ11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;

        for(int i=0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }

        for(int i=n-1; i>=0; i--) {
        	if(arr[i] <= k) {
        		count += k/arr[i];
        		k %= arr[i];
        	}
        }
        
        System.out.println(count);
        
	}

}