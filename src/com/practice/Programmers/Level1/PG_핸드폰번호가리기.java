package com.practice.Programmers.Level1;

class PG_핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length() - 4;
        answer = phone_number.substring(len, phone_number.length());
        String temp = "";
        for(int i=0; i<len; i++) {
            temp += "*";
        }
        answer = temp.concat(answer);
        return answer;
    }
}