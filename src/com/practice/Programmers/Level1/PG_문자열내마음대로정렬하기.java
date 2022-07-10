package com.practice.Programmers.Level1;

import java.util.Arrays;

class PG_문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i=0; i<strings.length; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(answer);
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = answer[i].substring(1,answer[i].length());
        }
        return answer;
    }
}