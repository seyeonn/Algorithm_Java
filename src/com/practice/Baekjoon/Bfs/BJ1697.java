package com.practice.Baekjoon.Bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ1697 {
    static int N,K, cnt=0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        K = scan.nextInt();

        // X-1 or X+1 or 2*X 이동

        bfs(N);

    }

    private static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        // 방문할 때 마다 체크가 필요
        int[] visited = new int[100001];

        // 방문 시작 배열 초기화
        q.offer(n);
        visited[n] = 1;

        while(!q.isEmpty()) {
            // 현재 위치 빼기
            int cur = q.poll();

            // 현재 위치가 K면 탈출
            if(cur == K){
                System.out.println(visited[cur]-1);
                break;
            }
            // 경계값 탐색 + 방문하지 않았다면
            if(cur-1 >= 0 && visited[cur-1] == 0){
                visited[cur-1] = visited[cur] + 1;
                q.add(cur-1);
            }
            if(cur+1 < 100001 && visited[cur+1] == 0) {
                visited[cur+1] = visited[cur] + 1;
                q.add(cur+1);
            }
            if(cur*2 <100001 && visited[cur*2] == 0) {
                visited[cur*2] = visited[cur] + 1;
                q.add(cur*2);
            }

        }
    }
}
