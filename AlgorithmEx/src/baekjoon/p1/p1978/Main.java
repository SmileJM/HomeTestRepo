package baekjoon.p1.p1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {	

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] strArr = str.split(" ");
		int primeCount = 0;		
		
		for(int i=0; i<n; i++) {
			boolean result = true;
			int num = Integer.parseInt(strArr[i]);
			for(int k=2; k<=Math.sqrt(num); k++) {
				if( num%k ==0 ) {
					result = false;
					break;
				}
			}
			if(result && num!=1) {
				primeCount++;
			}
		}
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		out.println(primeCount);
		out.flush();
		out.close();
	}
}
