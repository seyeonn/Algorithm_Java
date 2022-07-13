package com.practice.Programmers.Level1;

class PG_숫자문자열과영단어 {
    public int solution(String s) {
        int answer = 0;
        String temp = s;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<s.length()-1; i++) {
            for(int j=i+1; j<s.length(); j++) {
                String str = s.substring(i, j+1);
                
                for(int k=0; k<numbers.length; k++) {
                    if(str.equals(numbers[k])) {
                        temp = temp.replace(str, k+"");
                    }
                        
                }
            }
        }
        answer = Integer.parseInt(temp);
        return answer;
    }
}

/*
재풀이
class Solution {
    public int solution(String s) {
        
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<10; i++) {
            s = s.replaceAll(alpha[i], numbers[i]);
        }
        return Integer.parseInt(s);
    }
}
*/
