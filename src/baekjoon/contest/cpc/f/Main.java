package baekjoon.contest.cpc.f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int c = br.read()-48;
			br.read();
			int k = br.read()-48;
			br.readLine();
			sum += c * k * (int)Math.pow(2, k-1);
		}
		int result = (int)sum%((int)Math.pow(10, 9)+7);
		System.out.print(result);
	}
}
