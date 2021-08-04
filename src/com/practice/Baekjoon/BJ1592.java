package com.practice.Baekjoon;

import java.util.Scanner;

public class BJ1592 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int L = scan.nextInt();

        int[] arr = new int[N+1];

        //arr[0] = 1;
        int i=1;
        int count = -1;
        while(true) {
            if(arr[i] == M)
                break;

            ++count;

            if(arr[i]%2 == 0){
                i -= L;
                if(i<1)
                    i += N;
                arr[i]++;
            }
            else {
                i += L;
                if(i >N)
                    i -= N;
                arr[i]++;
            }
        }
        System.out.println(count);
    }
}
