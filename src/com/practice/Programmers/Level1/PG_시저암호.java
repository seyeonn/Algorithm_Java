package com.practice.Programmers.Level1;

class PG_시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // 공백일 경우 공백 저장
            if(c == ' ') {
                answer += c;
                continue;
            }

            // 소문자/대문자의 경우 나누기 + z,Z 처리
            // z에서 a로 순환하므로 다른 알파벳 처리도 필요하다.
            if(Character.isLowerCase(c)) {
                if(c + n > 'z') {
                    answer += (char)(c-26+n);
                }else {
                    answer += (char)(c+n);
                }
            }else if(Character.isUpperCase(c)) {
                if(c + n > 'Z') {
                    answer += (char)(c-26+n);
                }else {
                    answer += (char)(c+n);
                }
            }
        }
        
        return answer;
    }
}