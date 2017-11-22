package baekjoon.p1.p1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {		
		String str = br.readLine();
		String[] mnArr = str.split(" ");
		int m = Integer.parseInt(mnArr[0]);
		int n = Integer.parseInt(mnArr[1]);
		boolean[] arr = new boolean[n+1];
		
		arr[0] = true;
		arr[1] = true;
		
		int i=2;
		
		while(i<=Math.sqrt(n)) {
			boolean findNext = false;
			int next = 0;
			for(int k=i; k<=n; k++) {
				if(!arr[k] && k%i==0 && k!=i) {
					arr[k] = true;
				}
				if(!findNext && !arr[k] && k>i ) {
					next = k;
					findNext = true;
				}
			}
			if(next == 0) {
				i++;
			} else {
				i = next;	
			}
		}
				
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for(int k=m; k<=n; k++) {
			if(!arr[k]) {
				out.println(k);
			}
		}
		
		out.flush();
		out.close();
	}
}
