package com.practice.SWExpert.D3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SW1228 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {
            int N = scan.nextInt();
            List<Integer> list = new LinkedList<Integer>();

            for (int i = 0; i < N; i++) {
                list.add(scan.nextInt());
            }

            int N2 = scan.nextInt();

            for (int i = 0; i < N2; i++) {
                String str = scan.next();
                int start = scan.nextInt();
                int size = scan.nextInt();

                for (int j = 0; j < size; j++) {
                    list.add(start++, scan.nextInt());
                }
            }

            System.out.print("#" + (t+1)+" ");
            for (int i = 0; i < 10; i++) {
                System.out.println(list.get(i)+" ");
            }
        }
    }
}
