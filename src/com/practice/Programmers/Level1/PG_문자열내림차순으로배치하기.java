package com.practice.Programmers.Level1;

import java.util.*;

class PG_문자열내림차순으로배치하기 {
    public String solution(String s) {
        
        String answer = "";
        String[] arr = new String[s.length()];
        
        for(int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i) + "";
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<s.length(); i++) {
            answer += arr[i];
        }
        return answer;
    }
}