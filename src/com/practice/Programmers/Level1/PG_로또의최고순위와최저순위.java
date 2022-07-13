package com.practice.Programmers.Level1;

class PG_로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0){
                zero++;
            }
            for(int j=0; j<lottos.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }
        
        answer[0] = rank(count+zero);
        answer[1] = rank(count);
        return answer;
    }
    
    public int rank(int num) {
        switch(num) {
            case 6 :
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}