package com.practice.Baekjoon.Str;

import java.util.Arrays;
import java.util.Scanner;

public class BJ10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[][] members = new String[n][2];

		for(int i=0; i<n; i++) {
			members[i][0] = scan.next();
			members[i][1] = scan.next();
		}
		
		Arrays.sort(members,(a,b) -> {
			return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
		});
		
		for(int i=0; i<members.length; i++)
            System.out.println(members[i][0] + " " + members[i][1]);
		
	}

}