package com.practice.Programmers.Level1;

import java.util.Arrays;
import java.util.ArrayList;

class PG_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                // 중복 검사
                if(!arr.contains(sum)) {
                    arr.add(sum);
                }
            }
        }
        
        int[] answer = new int[arr.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}