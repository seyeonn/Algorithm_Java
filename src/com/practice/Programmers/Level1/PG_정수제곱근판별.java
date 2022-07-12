package com.practice.Programmers.Level1;

class PG_정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        long index = 2;
        int count = 0;
        for(long i=1; i<=n; i++) {
            if(i*i == n){
                answer = (i+1)*(i+1);
                count++;
                break;
            }
        }
        
        if(count == 0)
            answer = -1;
        
        return answer;
    }
}