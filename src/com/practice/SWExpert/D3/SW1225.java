package com.practice.SWExpert.D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SW1225 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {
            scan.nextInt();
            Queue<Integer> queue = new LinkedList<Integer>();
            for (int i = 0; i < 8; i++) {
                queue.offer(scan.nextInt());
            }

            int idx = 1;
            while(true) {
                int value = queue.poll() - idx;
                if(value <= 0) {
                    queue.add(0);
                    break;
                }
                else {
                    queue.offer(value);
                }
                idx++;
                if(idx == 6){
                    idx = 1;
                }
            }

            System.out.print("#" + (t+1) + " ");
            for (int i = 0; i < 8; i++) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
        }

    }
}
