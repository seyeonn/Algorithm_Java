package com.practice.Baekjoon.Bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2667 {
   static int N;
   static int[][] arr;
   static int oneCnt=0;
   static boolean[][] visited;
   static int[] bd = new int[25*25];
   static int[] dr = {-1, 1, 0, 0};
   static int[] dc = {0, 0, -1, 1};

   static class Point {
      int r;
      int c;

      public Point(int r, int c) {
         this.r = r;
         this.c = c;
      }
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner scan = new Scanner(System.in);

      N = scan.nextInt();

      arr = new int[N][N];
      visited = new boolean[N][N];

      for (int i = 0; i < arr.length; i++) {
         String s = scan.next();
         for (int j = 0; j < N; j++) {
            arr[i][j] = s.charAt(j)-'0';
         }
      }

      for (int i = 0; i < N; i++) {
         for (int j = 0; j < N; j++) {
            if(arr[i][j] == 1 && !visited[i][j]) {
               // 아파트 갯수
               oneCnt++;
               bfs(i, j);
            }
         }
      }

      Arrays.sort(bd);

      System.out.println(oneCnt);
      for (int i = 0; i < bd.length; i++) {
         if(bd[i] != 0)
            System.out.println(bd[i]);
      }
   }

   private static void bfs(int r, int c) {
      // TODO Auto-generated method stub
      Queue<Point> q = new LinkedList<>();
      q.add(new Point(r,c));
      
      visited[r][c] =true;
      bd[oneCnt]++;

      while(!q.isEmpty()) {
         Point cur = q.poll();
         int sr = cur.r;
         int sc = cur.c;

         for (int i = 0; i < dr.length; i++) {
            int nr = sr + dr[i];
            int nc = sc + dc[i];

            if(nr >= 0 && nr<N && nc>=0 && nc<N && !visited[nr][nc] && arr[nr][nc] == 1) {
               q.add(new Point(nr,nc));
               visited[nr][nc] = true;
               bd[oneCnt]++;
            }
         }
      }
   }
}