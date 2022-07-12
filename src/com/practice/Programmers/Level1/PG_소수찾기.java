package com.practice.Programmers.Level1;

class PG_소수찾기 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        
        // 에라토스테네스의 체
        // 빈 배열에 숫자 삽입
        for(int i=2; i<=n; i++) {
            arr[i] = i;
        }
        
        // 2부터 자기 자신을 제외한 배수를 지운다.
        for(int i=2; i<n; i++) {
            if(arr[i] == 0)
                continue;
            
            for(int j=2*i; j<=n; j+=i)
                arr[j] = 0;
        }
        
        // 소수가 되는 수의 배수들을 지우면 소수만 남는다.
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0)
                answer++;
        }
        return answer;
    }
}