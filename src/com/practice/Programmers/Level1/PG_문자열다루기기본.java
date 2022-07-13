package com.practice.Programmers.Level1;

class PG_문자열다루기기본 {
    public boolean solution(String s) {
        // parseInt로 검사하기 위해 try-catch 구문 이용
        if(s.length() == 4 || s.length() == 6) {
            try {
                int num = Integer.parseInt(s);
                return true;
            }catch(NumberFormatException e) {
                return false;
            }
        }
        else 
            return false;
    }
}