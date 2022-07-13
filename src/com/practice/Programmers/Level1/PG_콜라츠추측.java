package com.practice.Programmers.Level1;

class PG_콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        
        // *3을 해주기 때문에 long으로 변환 필요
        long n = num;
        
        while(n != 1) {
            answer++;
            n = n%2==0 ? n/2 : n*3+1;
            
            if(answer > 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}