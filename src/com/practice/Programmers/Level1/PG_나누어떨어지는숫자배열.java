package com.practice.Programmers.Level1;

import java.util.ArrayList;
import java.util.Collections;

class PG_나누어떨어지는숫자배열 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0){
                count++;
                answer.add(arr[i]);
            }   
        }
        
        Collections.sort(answer);
        
        if(count == 0){
            answer.add(-1);
        }
        return answer;
    }
}