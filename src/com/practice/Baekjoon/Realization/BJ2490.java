package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[4];

		for(int i=0; i<3; i++)  {
			int count = 0;

			for(int j=0; j<4; j++) {
				arr[i] = scan.nextInt();
				if(arr[i] == 1)
					count++;
			}

			if(count == 4)
				System.out.println("E");
			else if(count == 3)
				System.out.println("A");
			else if(count == 2)
				System.out.println("B");
			else if(count == 1)
				System.out.println("C");
			else
				System.out.println("D");
		}

		scan.close();
	}

}