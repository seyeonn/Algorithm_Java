package com.practice.Programmers.Level1;

import java.util.Arrays;

class PG_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        int index = 0;
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim"))
                index = i;
        }
        return "김서방은 " + index + "에 있다";
    }
}