package baekjoon.p1.p1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();		
		
		while(n>0) {
			list.add(n%10);
			n /= 10;
		}		
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for(int k=list.size()-1; k>=0; k--) {
			out.print(list.get(k));
		}
		
		out.flush();
		out.close();

	}	
}
