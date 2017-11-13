package baekjoon.p10.p10989;

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
		int[] arrTemp = new int[10000];
		for( int i=0;i<n; i++) {
			arrTemp[Integer.parseInt(br.readLine())-1]++;
		}
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for( int i=0;i<arrTemp.length; i++) {
			if(arrTemp[i]>0) {
				for(int k=0; k<arrTemp[i]; k++) {
					pw.println(i+1);						
				}					
			}			
		}		
		pw.flush();
		pw.close();
	}
}
