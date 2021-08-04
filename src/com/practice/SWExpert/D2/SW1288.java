package com.practice.SWExpert.D2;

import java.util.Scanner;

public class SW1288 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int t=0; t<T; t++) {
            String n = scan.next();
            int nn = Integer.parseInt(n);
            int count = 0;
            int num = 1;

            boolean[] v = new boolean[10];

            while(true) {
                for (int i = 0; i < n.length(); i++) {
                    int tmp = Integer.parseInt(n.substring(i, i + 1));

                    if (v[tmp] == false) {
                        v[tmp] = true;
                        count++;
                    }
                }
                if (count == 10) {
                    break;
                }
                else {
                    num++;
                    n = Integer.toString(num*nn);
                }

            }
            System.out.println(n);
        }
    }
}
