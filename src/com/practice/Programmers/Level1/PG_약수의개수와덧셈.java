package com.practice.Programmers.Level1;

public class PG_약수의개수와덧셈 {
	
	public int solution(int left, int right) {
        int answer = 0;
        int[] arr = new int[right-left+1];
        int odd = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = left++;
            
            for(int j=1; j<33; j++) {
                if(j*j == arr[i]) {
                    odd = arr[i];
                }
            }
            
            if(arr[i] == odd)
                answer -= arr[i];
            else
                answer += arr[i];
        }
        
        return answer;
    }
}
