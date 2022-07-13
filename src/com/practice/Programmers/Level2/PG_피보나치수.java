package com.practice.Programmers.Level2;

class PG_피보나치수 {
    public int solution(int n) {
        int sum = 0;
        int[] fibo = new int[n+1];
        
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<=n; i++) {
            sum = fibo[i-1] + fibo[i-2];
            fibo[i] = sum%1234567;
        }
        
        return fibo[n];
    }
}