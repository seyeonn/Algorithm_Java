package com.practice.Baekjoon.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] arr = new int[N];
		Integer[] arr2 = new Integer[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		Arrays.sort(arr2, Collections.reverseOrder());
		
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			ans += arr[i] * arr2[i];
		}
		
		System.out.println(ans);
	}

}
