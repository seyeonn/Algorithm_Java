package com.practice.Baekjoon.Math1;

import java.util.Scanner;
// 롤 케이크
public class BJ3985 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        int N = scan.nextInt();
        boolean[] arr = new boolean[L+1];

        int ex = 0;
        int fIndex = 0;
        int tIndex = 0;
        int tMax = 0;
        for (int i = 0; i < N; i++) {
            int P = scan.nextInt();
            int K = scan.nextInt();

            if(ex < (K-P+1)) {
                ex = (K - P + 1);
                fIndex = i+1;
            }

            int t = 0;
            for(int j = P; j<=K; j++){
                if(arr[j] == false) {
                    t++;
                    arr[j] = true;
                }
                else{
                    continue;
                }
            }

            if(tMax < t) {
                tMax = t;
                tIndex = i+1;
            }
        }

        System.out.println(fIndex);
        System.out.println(tIndex);
    }
}
