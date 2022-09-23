package com.practice.Programmers.Level1;

class PG_부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        
        for(int i=1; i<=count; i++) {
            total += price*i;
        }

        if(total > money)
            answer = total - money;
        
        return answer;
    }
}