package com.practice.Baekjoon.Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] stack = new int[n];
		int top =0;
		int num = 0;
		
		while(n-- > 0) {
			int temp = Integer.parseInt(br.readLine());
			
			if(temp>num) {
				for(int i = num+1; i<=temp; i++) {
					stack[top++] = i;
					sb.append("+\n");
				}
				num = temp;
			}
			else if(stack[top-1] != temp) {
				bw.write("NO");
				bw.close();
				System.exit(0);
			}
			top--;
			sb.append("-\n");
		}
		bw.write(String.valueOf(sb));
		
		br.close();
		bw.close();
	}

}
