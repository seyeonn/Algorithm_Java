package com.practice.Baekjoon.Math1;

import java.util.Arrays;
import java.util.Scanner;
// 롤 케이크
public class BJ16206 {
    static int num;
    static int N, M;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();

        int[] arr = new int[N];
        int[] mod = new int[N];

        for(int n=0; n<N; n++) {
            arr[n] = scan.nextInt();
        }

        Arrays.sort(arr);

        num = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 10) {
                num++;
                continue;
            }
            else if(arr[i] >10){
                if(arr[i]%10 == 0){
                    cut(arr[i]);
                }else {
                    mod[i] = arr[i];
                }
            }
        }

        for (int i = 0; i < mod.length; i++) {
            if(mod[i]>10)
                cut(mod[i]);
        }

        System.out.println(num);
    }

    private static void cut(int i) {
       if(M <= 0)
           return;
       M--;
       num++;

       int temp = i-10;
       if(temp == 10)
           num++;
       else if(temp > 10)
           cut(temp);

    }

}
