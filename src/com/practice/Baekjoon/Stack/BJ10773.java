package com.practice.Baekjoon.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BJ10773 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int n = scan.nextInt();

            if(n != 0) {
                stack.push(n);
            }
            else {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
