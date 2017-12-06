package baekjoon.p10.p10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Integer> queue = new ArrayList<>();
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	public static void main(String[] args) throws NumberFormatException, IOException {			
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String cmd = br.readLine();
			String[] arrCmd = cmd.split(" ");
			switch(arrCmd[0]){
				case "push": queue.add(Integer.parseInt(arrCmd[1]));
					break;
				case "pop": out.println(pop());
					break;
				case "size": out.println(queue.size());
					break;
				case "empty": 
					if(queue.isEmpty()) {
						out.println(1);
					} else {
						out.println(0);
					}
					break;
				case "front":
					if(queue.isEmpty()) {
						out.println(-1);
					} else {
						out.println(queue.get(0));
					}
					break;
				case "back":
					if(queue.isEmpty()) {
						out.println(-1);
					} else {
						out.println(queue.get(queue.size()-1));
					}
					break;
			}			
		}
		out.println();
		out.flush();
		out.close();
	}
	
	private static int pop() {		
		int q = -1;
		if(!queue.isEmpty()) {
			q = queue.get(0);
			queue.remove(0);
		}		
		return q;
	}
}
