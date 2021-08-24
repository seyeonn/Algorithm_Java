package com.practice.Baekjoon.Realization;

import java.util.Scanner;
// 참외밭
public class BJ2477 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();  //참외 갯수

        int[][] area = new int[6][2];
        for (int i = 0; i < 6; i++) {
                area[i][0] = scan.nextInt(); // 방향
                area[i][1] = scan.nextInt(); // 길이
        }

        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        int dirW = 0;
        int dirH = 0;
        for (int i = 0; i < 6; i++) {
                if(area[i][0] == 1 || area[i][0] == 2){
                    if(maxH < area[i][1]) {
                        maxH = area[i][1];
                        dirH = i;
                    }
                }
                else if(area[i][0] == 3 || area[i][0] == 4){
                    if(maxW < area[i][1]) {
                        maxW = area[i][1];
                        dirW = i;
                    }
                }
        }

        int x =0;
        if(dirH == 0){
            x = Math.abs(area[5][1] - area[dirH+1][1]);
        }
        else if(dirH == 5){
            x = Math.abs(area[dirH-1][1] - area[0][1]);
        }
        else{
            x = Math.abs(area[dirH-1][1] - area[dirH+1][1]);
        }

        int y =0;
        if(dirW == 0){
            y = Math.abs(area[5][1] - area[dirW+1][1]);
        }
        else if(dirW == 5) {
            y = Math.abs(area[dirW - 1][1] - area[0][1]);
        }
        else {
            y = Math.abs(area[dirW - 1][1] - area[dirW + 1][1]);
        }

        int ans = ((maxH*maxW) - (x*y)) * K;

        System.out.println(ans);
    }
}
