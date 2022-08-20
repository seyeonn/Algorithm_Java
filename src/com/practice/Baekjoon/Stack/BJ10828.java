package com.practice.Baekjoon.Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[10000];
        int top = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
            case "push":
            	top++;
            	stack[top] = Integer.parseInt(st.nextToken());
            	break;
            case "pop":
            	if(top == -1)
            		bw.write(String.valueOf(top) + "\n");
            	else {
            		bw.write(String.valueOf(stack[top]) + "\n");
            		top--;
            	}
            	break;
            case "size" :
            	 bw.write(String.valueOf(top + 1) + "\n");
                 break;
            case "empty" :
            	if(top == -1)
            		bw.write("1" + "\n");
            	else
            		bw.write("0" + "\n");
            	break;
            case "top" :
            	if(top == -1)
            		bw.write(String.valueOf(top) + "\n");
            	else
            		bw.write(String.valueOf(stack[top]) + "\n");
            	break;

            }
        }
        br.close();
        bw.close();
	}

}
