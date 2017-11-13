package baekjoon.p2.p2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine());

		int sum = 0;
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sum = method(k, n);
			System.out.println(sum);
		}
	}

	private static int method(int k, int n) {
		int result = 0;
		if (k < 0) {
			result = 0;
		} else if (k == 0) {
			result = n;
		} else {
			for (int i = 1; i <= n; i++) {
				result += method(k - 1, i);
			}
		}
		return result;
	}
}
