package com.practice.Baekjoon.GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String st = br.readLine();
		String[] minus = st.split("-");

		int result = 0;

		for(int i=0; i<minus.length; i++) {
			String[] plus = minus[i].split("\\+");
			int sum = 0;

			for(int j=0; j<plus.length; j++) {
				sum += Integer.parseInt(plus[j]);
			}

			if(i == 0)
				result = sum;
			else
				result -= sum;
		}
	        bw.write(String.valueOf(result));
	        bw.close();
	        br.close();

	}

}
