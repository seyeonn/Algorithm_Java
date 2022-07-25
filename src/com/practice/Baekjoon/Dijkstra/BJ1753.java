package com.practice.Baekjoon.Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BJ1753 {
static class Edge implements Comparable<Edge>{
	int end;
	int value;
	
	public Edge(int end, int value) {
		this.end = end;
		this.value = value;
	}
	
    @Override
    public int compareTo(Edge o) {
        return this.value - o.value;
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int V = scan.nextInt();
		int E = scan.nextInt();
		int K = scan.nextInt();
		
		List<Edge> list[] = new ArrayList[V+1];
		int[] dij = new int[V+1];
		boolean[] visited = new boolean[V+1];
		
		for (int i = 1; i <= V; i++) {
			list[i] = new ArrayList<Edge>();
		}
		
		for (int i = 0; i < E; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			int w = scan.nextInt();
			
			list[u].add(new Edge(v,w));
		}
		
		Arrays.fill(dij, Integer.MAX_VALUE);
		
		PriorityQueue<Edge> q = new PriorityQueue<>();
		
		q.add(new Edge(K,0));
		dij[K] = 0;
		
		while(!q.isEmpty()) {
			int cur = q.poll().end;
			
			if(!visited[cur])
				visited[cur] = true;
			
			for (Edge e : list[cur]) {
				if(dij[e.end] > dij[cur] + e.value) {
					dij[e.end] = dij[cur] + e.value;
					q.add(new Edge(e.end, dij[e.end]));
				}
			}
		}
		
		for (int i = 1; i <= V; i++) {
			if(dij[i] == Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(dij[i]);
		}
	}

}