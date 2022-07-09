package com.practice.Programmers.Level1;

class PG_약수의합 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            if(n%i ==0){
                answer += i;
            }
        }
        return answer;
    }
}