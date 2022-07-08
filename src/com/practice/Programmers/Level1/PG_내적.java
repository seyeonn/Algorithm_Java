package com.practice.Programmers.Level1;

class PG_내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}