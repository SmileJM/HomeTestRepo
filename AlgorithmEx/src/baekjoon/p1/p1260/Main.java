package baekjoon.p1.p1260;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Queue;

public class Main {	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
	private static Queue<Integer> queue;
	
	private static boolean [][] lines;
	private static boolean [] dfsVisit;
	private static boolean [] bfsVisit;
	
	public static void main(String[] args) throws IOException {		
		String[] data = br.readLine().split(" "); 
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);
		int v = Integer.parseInt(data[2]);
		
		lines = new boolean[n+1][n+1];
		dfsVisit = new boolean[n+1];
		bfsVisit = new boolean[n+1];
		
		for(int i=1; i<=n; i++) {
			data = br.readLine().split(" ");
			int idx1 = Integer.parseInt(data[0]);
			int idx2 = Integer.parseInt(data[1]);
			lines[idx1][idx2] = lines[idx2][idx1] = true;
		}

		dfs(v);
		bfs(v);
		out.flush();
		out.close();
	}

	private static void dfs(int v) {		
		dfsVisit[v] = true;		
		
		out.print(v + " ");		
		for(int i=1; i<lines[v].length; i++) {
			if(lines[v][i] && !dfsVisit[i]){
				dfs(i);
			}
		}
	}

	private static void bfs(int v) {
		
	}

}
