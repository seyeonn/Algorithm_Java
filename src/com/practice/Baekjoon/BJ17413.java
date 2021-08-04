package com.practice.Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class BJ17413 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Character> stack = new Stack<Character>();
        String S = scan.nextLine();
        boolean flag = false;

        for (int i = 0; i <S.length() ; i++) {
            char c = S.charAt(i);

            if(c == '<') {
                print(stack);
                flag = true;
                System.out.print(c);
            }
            else if(c == '>') {
                flag = false;
                System.out.print(c);
            }
            else if(c == ' ') {
                print(stack);
                System.out.print(c);
            }
            else if(flag) {
                System.out.print(c);
            }
            else {
                stack.push(c);
            }
        }
        print(stack);

    }

    public static void print(Stack stack) {
        while(!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
