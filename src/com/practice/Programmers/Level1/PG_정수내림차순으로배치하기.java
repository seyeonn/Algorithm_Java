package com.practice.Programmers.Level1;

import java.util.*;
import java.lang.*;

class PG_정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        long[] arr = new long[String.valueOf(n).length()];
        
        int i=0;
        while(n > 0) {
            arr[i++] = n%10;
            n = n/10;
        }
        i -= 1;
        
        Arrays.sort(arr);
        
        for(int k=arr.length-1; k>=0; k--) {
            answer += arr[k] * (Math.pow(10,i--));
        }
        
        return answer;
    }
}