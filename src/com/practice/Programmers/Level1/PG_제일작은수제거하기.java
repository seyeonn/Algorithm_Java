package com.practice.Programmers.Level1;

import java.util.ArrayList;

class PG_제일작은수제거하기 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        if(arr.length == 1) {
            answer.add(-1);
            return answer;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            answer.add(arr[i]);
            if(min > arr[i])
                min = arr [i];
        }
        System.out.println(min);
        for(int i=0; i<answer.size(); i++) {
            if(answer.get(i) == min)
                answer.remove(i);
        }
        
        return answer;
    }
}