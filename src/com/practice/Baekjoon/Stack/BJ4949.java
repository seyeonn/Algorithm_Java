package com.practice.Baekjoon.Stack;

import java.util.Scanner;

public class BJ4949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
        char[] stack = new char[100];
        int top = -1;

        while(true) {
        	String str = scan.nextLine();
        	if(str.equals("."))
        		break;

        	loop:
        	for(int i=0; i<str.length(); i++) {
        		switch(str.charAt(i)) {
        		case '[' :
        			top++;
        			stack[top] = '[';
        			break;
        		case ']' :
        			if (top == -1 || stack[top] == '(') {
                        top++;
                        break loop;
                    } else
                        top--;
                    break;
        		case '(' :
        			top++;
        			stack[top] = '(';
        			break;
        		case ')' :
        			if (top == -1 || stack[top] == '[') {
                        top++;
                        break loop;
                    } else
                        top--;
                    break;
        		}
        	}
        	if(top == -1)
                System.out.println("yes");
        	else
        		System.out.println("no");

        	top = -1;
        }
	}

}