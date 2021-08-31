package com.practice.SWExpert.D2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SW1983 {
        static String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int t = scan.nextInt();

            for(int i=0; i<t; i++) {
                int n = scan.nextInt();
                int k = scan.nextInt();

                double find = 0.0;
                Double[] result = new Double[n];

                for(int j=0; j<n; j++) {
                    int mid = scan.nextInt();
                    int fin = scan.nextInt();
                    int sub = scan.nextInt();

                    double sum = 0.35*mid + 0.45*fin + 0.20*sub;
                    result[j] = sum;

                    if(j+1 == k)
                        find = sum;
                }
                Arrays.sort(result, Collections.reverseOrder());

                int index = 0;
                for(int j=0; j<result.length; j++) {
                    if(result[j] == find)
                        index = j;
                }

                index = index/ (n/10);

                System.out.printf("#%d %s \n", (i+1), score[index]);
            }
        }
}
