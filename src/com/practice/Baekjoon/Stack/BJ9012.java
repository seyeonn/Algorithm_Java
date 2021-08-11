package com.practice.Baekjoon.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BJ9012 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            String s = scan.next();
            String result = VPS(s);
            System.out.println(result);

        }
    }
    private static String VPS(String s) {
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(c == '(') {
                    stack.push(c);
                }
                else if(stack.isEmpty()){
                    return "NO";
                }
                else {
                    stack.pop();
                }
            }

            if(stack.isEmpty())
                return "YES";
            else
                return "NO";

        }

}
