package com.practice.Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PG_모의고사 {

	public int[] solution(int[] answers) {
        int[][] person = {{1, 2, 3, 4, 5}, 
                          {2, 1, 2, 3, 2, 4, 2, 5}, 
                          {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        
        int[] score = {0, 0, 0};
        
        for(int i=0; i<answers.length; i++) {
            if(person[0][i%5] == answers[i])
                score[0]++;
            if(person[1][i%8] == answers[i])
                score[1]++;
            if(person[2][i%10] == answers[i])
                score[2]++;
        }
        
        int[] scoreCopy = Arrays.copyOf(score, 3);
        Arrays.sort(scoreCopy);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++) {
            if(score[i] == scoreCopy[2])
                list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        
         for(int i=0; i<answer.length; i++) {
             answer[i] = list.get(i);
         }                 
                                        
        return answer;
    }

}
