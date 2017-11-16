package baekjoon.p2.p2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int avg = 0;
		int mid = 0;
		int frq = 0;
		int rng = 0;
		int low = 4000;
		int high = -4000;
		
		int[] arr = new int[8001];
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num > high) {
				high = num;
			}
			if(num < low) {
				low = num;
			}
			arr[num+4000]++;
			sum += num;
		}
		
		TreeSet<Integer> set = new TreeSet<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				map.put(i-4000, arr[i]);				
			}
		}
		
		avg = (int)Math.round(1.0*sum/n);
		rng = high - low;
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		out.println(avg);
		out.println(rng);
		out.flush();
		out.close();
		
	}
}
