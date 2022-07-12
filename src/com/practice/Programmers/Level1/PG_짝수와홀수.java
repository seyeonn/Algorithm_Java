package com.practice.Programmers.Level1;

class PG_짝수와홀수 {
    public String solution(int num) {
        String answer = "";
        answer = (num%2 == 0 ? "Even" : "Odd");
        return answer;
    }
}