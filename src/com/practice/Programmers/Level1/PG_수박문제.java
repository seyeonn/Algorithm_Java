package com.practice.Programmers.Level1;

class PG_수박문제 {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"수", "박"};
        
        for(int i=0; i<n; i++) {
            answer += arr[i%2];
        }
        return answer;
    }
}