package com.practice.Programmers.Level1;

class PG_문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        if(!s.contains("p") && !s.contains("y")) {
            return answer;
        }
            
        int p = 0;
        int y = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p')
                p++;
            else if(s.charAt(i) == 'y')
                y++;
        }
        
        if(p != y) {
            answer = false;
        }
        
        return answer;
    }
}