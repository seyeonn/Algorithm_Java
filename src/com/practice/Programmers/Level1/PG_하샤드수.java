package com.practice.Programmers.Level1;

class PG_하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        // 초기값 저장
        int start = x;
        // 자릿수 합
        int sum = 0;
        
        // 자릿수 합 구하기
        while(x > 0) {
            sum += x%10;
            x = x/10;
        }
        
        answer = ( start%sum == 0 ? true : false);
        
        return answer;
    }
}