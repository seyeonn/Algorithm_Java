package com.practice.Programmers.Level1;

class PG_2016년 {
    public String solution(int a, int b) {
        // 첫 날인 금요일부터 정렬
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for(int i=0; i<a-1; i++) {
            sum += date[i];
        }
        sum += (b-1);
        return day[sum%7];
    }
}