package com.practice.Programmers.Level1;

class PG_x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        // 더하는 숫자 값이 계속 커지기 때문에 long으로 선언해줘야 함.
        long num = x;
        for(int i=0; i<answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}