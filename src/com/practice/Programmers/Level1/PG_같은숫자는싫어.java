package com.practice.Programmers.Level1;

import java.util.*;

public class PG_같은숫자는싫어 {
    public ArrayList<Integer> solution(int []arr) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        // 비교해줄 값
        int num = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != num) {
                answer.add(arr[i]);
                num = arr[i];
            }
        }

        return answer;
    }
}