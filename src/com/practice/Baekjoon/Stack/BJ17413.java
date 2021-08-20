package com.practice.Baekjoon.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BJ17413 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Character> stack = new Stack<Character>();
        String S = scan.nextLine();
        // 태그가 열려있는지 닫혀있는지 검사 (꼭 필요함, 암기 !!!!!!!!)
        boolean flag = false;

        for (int i = 0; i <S.length() ; i++) {
            // 문자 하나씩 비교하기
            char c = S.charAt(i);

            if(c == '<') {      // 태그 시작하면 앞에 문자 있는지 확인 - 있으면 스택에서 빼오기
                print(stack);
                flag = true;
                System.out.print(c);
            }
            else if(c == '>') { // 태그 닫히면 문자 출력
                flag = false;
                System.out.print(c);
            }
            else if(c == ' ') { // 공백이면 앞에 문자 있는지 확인 - 있으면 스택에서 빼오기
                print(stack);
                System.out.print(c);
            }
            else if(flag) {     // 태그가 열려있는 상태면 문자 그대로 출력
                System.out.print(c);
            }
            else {              // 스택에 문자 삽입
                stack.push(c);
            }
        }
        print(stack);  // 스택에 남아있는 문자 출력

    }

    public static void print(Stack stack) {
        while(!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
