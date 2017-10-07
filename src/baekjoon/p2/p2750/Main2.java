package baekjoon.p2.p2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[2001];
		for (int i = 0; i < n; i++) {
			int r = Integer.parseInt(br.readLine());
			arr[r + 1000] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				System.out.println(i-1000);
			}
		}
	}
}
