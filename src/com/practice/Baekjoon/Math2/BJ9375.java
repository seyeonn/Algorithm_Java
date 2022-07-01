package com.practice.Baekjoon.Math2;

import java.util.Scanner;
import java.util.HashMap;

public class BJ9375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
        Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int i=0; i<t; i++) {
			int n = scan.nextInt();
			HashMap<String, Integer> clothes = new HashMap<>();
			int result = 1;

			for(int j=0; j<n; j++) {
				String cloth = scan.next();
				String kind = scan.next();

				if(clothes.containsKey(kind))
					clothes.put(kind,  clothes.get(kind) + 1);
				else
					clothes.put(kind, 1);
			}

			for(int k : clothes.values())
				result *= k+1;

            System.out.println(--result);
		}

	}
}