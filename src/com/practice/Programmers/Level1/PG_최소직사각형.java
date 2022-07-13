package com.practice.Programmers.Level1;

class PG_최소직사각형 {
    public int solution(int[][] sizes) {
        
        int a = 0; // 가로 최대
        int b = 0; // 세로 최대
        
        for(int i=0; i<sizes.length; i++) {
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            if(a < sizes[i][0]) {
                a = sizes[i][0];
            }
            
            if(b <sizes[i][1]) {
                b = sizes[i][1];
            }
        }
        return a*b;
    }
}