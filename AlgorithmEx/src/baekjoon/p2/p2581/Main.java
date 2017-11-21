package baekjoon.p2.p2581;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		long sum = 0;
		int min = 0;		
		
		for (int i=n; i<=m; i++) {
			boolean result = true;
			for(int k=2; k<=Math.sqrt(i); k++) {
				if(i%k==0) {
					result = false;
					break;
				}
			}
			if(result && i!=1) {
				sum += i;
				if(min==0) {
					min = i;
				}
			}			
		}
			
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		if(min==0) {
			min = -1;			
		} else {
			out.println(sum);
		}
		out.println(min);
		out.flush();
		out.close();
	}
}
