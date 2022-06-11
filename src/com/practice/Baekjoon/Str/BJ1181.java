package com.practice.Baekjoon.Str;

import java.util.Scanner;
import java.util.Arrays;

public class BJ1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
		int n = scan.nextInt();
		
		String[] word = new String[n];
		
		for(int i=0; i<n; i++) 
			word[i] = scan.next();
		
		Arrays.sort(word,(a,b) -> {
			return Integer.compare(a.length(), b.length());
		});
		
		int len;
		int temp;
		int i,j;
		
		for(i=0; i<n; i++) {
			len = word[i].length();
			
			for(j=i+1; j<n; j++) {
				temp = word[j].length();
				
				if(len != temp)
					break;
			}
			
			Arrays.sort(word,i,j);
			i =j-1;
		}
		
        System.out.println(word[0]);
		for(int k=1; k<n; k++) {
			if(word[k-1].equals(word[k]))
				continue;
            System.out.println(word[k]);
		}
		
	}

}