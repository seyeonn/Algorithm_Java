package com.practice.Programmers.Level1;

class PG_3진법뒤집기 {
    public int solution(int n) {
        
        StringBuffer sb = new StringBuffer();
        while(n > 0) {
            sb.append(n%3);
            n /= 3;
        }
        //Integer.parseInt(변환할 문자열, 변환할 진수값);
        return Integer.parseInt(sb.toString(), 3);
    }
}