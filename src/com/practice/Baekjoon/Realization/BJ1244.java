package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ1244 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int student = scan.nextInt();

        for (int i = 0; i < student; i++) {
            int gender = scan.nextInt();
            int num = scan.nextInt();

            if(gender == 1) {
                for (int j = num, k=1; j*k <=arr.length ; k++) {
                    int idx = j*k -1;
                    arr[idx] = (arr[idx] == 1 ? 0 : 1);
                }
            }
            else if(gender == 2) {
                int idx = num-1;
                arr[idx] = (arr[idx] == 1 ? 0 : 1);
                for (int j = 1; j < arr.length/2; j++) {
                    if(idx-j<0 || idx+j>=arr.length)
                        break;
                    if(arr[idx-j] == arr[idx+j]){
                        arr[idx-j] = (arr[idx-j] == 1 ? 0 : 1);
                        arr[idx+j] = (arr[idx+j] == 1 ? 0 : 1);
                    }
                    else
                        break;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
            if((j+1)%20 ==0)
                System.out.println();
        }

    }
}
