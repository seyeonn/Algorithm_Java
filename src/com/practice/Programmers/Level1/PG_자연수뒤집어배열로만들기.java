package com.practice.Programmers.Level1;

class PG_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int index = 0;
        for(int i=s.length()-1; i>=0; i--) {
            answer[index++] = s.charAt(i)-'0';
        }
        return answer;
    }
}