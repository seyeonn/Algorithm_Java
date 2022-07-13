package com.practice.Programmers.Level2;

import java.lang.Math;

class PG_최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            
            if(num > max)
                max = num;
            
            if(num < min)
                min = num;
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}