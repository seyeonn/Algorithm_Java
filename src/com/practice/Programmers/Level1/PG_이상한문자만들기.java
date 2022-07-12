package com.practice.Programmers.Level1;

class PG_이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        
        for(int i=0; i<s.length(); i++) {
            String str = s.charAt(i) + "";
            if(str.equals(" ")) {
                index = 0;
            }
            else if(index%2 == 0) {
                str = str.toUpperCase();
                index++;
            }else if(index%2 == 1) {
                str = str.toLowerCase();
                index++;
            }
            answer += str;
        }
        return answer;
    }
}