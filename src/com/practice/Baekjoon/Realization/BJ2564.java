package com.practice.Baekjoon.Realization;

import java.util.Scanner;

public class BJ2564 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int N = scan.nextInt();

        int[][] loc = new int[N][2];

        for (int i = 0; i < N; i++) {
            loc[i][0] = scan.nextInt();
            loc[i][1] = scan.nextInt();
        }

        // 동근이의 위치
        int d = scan.nextInt();
        int l = scan.nextInt();

        int dis = 0;
        for (int i = 0; i < N; i++) {
            int dir = loc[i][0];
            int len = loc[i][1];
            if(loc[i][0] == d){
                dis += Math.abs(l-loc[i][1]);
            }
            else {
                switch (dir) {
                    case 1:  // 북
                        if (d == 2)
                            dis += Math.min(l + len + y, (x - l) + (x - len) + y);
                        else if (d == 3)
                            dis += (len + l);
                        else if (d == 4)
                            dis += ((x - len) + l);
                        break;
                    case 2: // 남
                        if (d == 1)
                            dis += Math.min(l + len + y, (x - l) + (x - len) + y);
                        else if (d == 3)
                            dis += ((y - l) + len);
                        else if (d == 4)
                            dis += ((x - len) + (y - l));
                        break;
                    case 3: // 서
                        if (d == 1)
                            dis += (l + len);
                        else if (d == 2)
                            dis += (l + (y - len));
                        else if (d == 4)
                            dis += Math.min(l + len + x, (y - l) + (y - len) + x);
                        break;
                    case 4:
                        if (d == 1)
                            dis += (len + (x - l));
                        else if (d == 2)
                            dis += ((y - len) + (x - l));
                        else if (d == 3)
                            dis += Math.min(l + len + x, (y - l) + (y - len) + x);
                        break;
                }
            }
        }
        System.out.println(dis);

    }
}
