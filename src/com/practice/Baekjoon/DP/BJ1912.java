package com.practice.Baekjoon.DP;

import java.util.*;

public class BJ1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
		int n = scan.nextInt();
		int arr[] = new int[n];
		int dp[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
        	dp[i] = arr[i];
			for (int j = i-1; j < i; j++) {
				if (dp[i] + dp[j] > dp[i])
					dp[i] += dp[j];
			}
		}

        Arrays.sort(dp);
        System.out.println(String.valueOf(dp[n-1]));
 
	}

}