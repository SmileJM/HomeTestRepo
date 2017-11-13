package baekjoon.p1.p1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String n = br.readLine();
		int[] count = new int[10];
		int max = 0;
		for (int i = 0; i < n.length(); i++) {
			String temp = n.substring(i, i + 1);
			count[Integer.parseInt(temp)]++;
		}
		double sixnine = (count[6]+count[9])/2.0;
		count[6] = (int)Math.ceil(sixnine);
		count[9] = (int)Math.ceil(sixnine);		
		for (int i = 0; i < 10; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}
		System.out.println(max);
	}
}
