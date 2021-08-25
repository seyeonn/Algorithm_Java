package com.practice.Jungol;

import java.util.Scanner;

// 오류 교정
public class JO1037 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int cntR = 0;
        int cntC = 0;
        int checkR = 0;
        int checkC = 0;
        int idxR = 0;
        int idxC = 0;
        String ans = "";
        L:for (int i = 0; i < n; i++) {
            cntC = 0;
            cntR = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    cntR++;
                }
                if(arr[j][i] == 1){
                    cntC++;
                }
            }

            if(cntR%2 != 0){
                checkR++;
                if(checkR == 2) {
                    //ans = "Corrupt";
                    System.out.println("Corrupt");
                    break L;
                }
                idxR = i+1;
            }

            if(cntC%2 != 0){
                checkC++;
                if(checkC == 2) {
                    //ans = "Corrupt";
                    System.out.println("Corrupt");
                    break L;
                }
                idxC = i+1;
            }
        }

        if(checkR == 1 && checkC == 1){
            System.out.println("Change bit (" + idxR + "," + idxC + ")");
        }
        else if(checkR == 0 && checkC == 0){
            System.out.println("OK");
        }
    }
}
