package com.practice.Programmers.Level1;

class PG_소수만들기 {
    public int solution(int[] nums) {
        
        int sum = 0;
        int answer = 0;
        
       for(int i=0; i<nums.length; i++){
           for(int j=i+1; j<nums.length; j++){
               for(int k=j+1; k<nums.length; k++) {
                       if(calc(nums[i] + nums[j] + nums[k])) {
                           answer++;
                       }
                   
               }
           }
       }
        return answer;
    }
    
    public boolean calc(int sum) {
        int count = 0;
        for(int i=1; i<=sum; i++) {
            if(sum%i == 0) {
                count++;
            }
        }
        
        if(count == 2)
            return true;
        else
            return false;
    }
}