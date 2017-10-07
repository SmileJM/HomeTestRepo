
package baekjoon.p6.p6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < t; i++) {

			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int result = 0;
			int big = 0;
			int small = 0;
			if(m>=n) {
				big = m;
				small = n;
			} else {
				big = n;
				small = m;
			}
			if( big%small == 0) {
				result = x;
			}
			if (x == y) {
				result = x;
			} else if (x < y) {
				result = m * y - n * x;
			} else if (y > x) {
				result = m * m - n * x;
			}
			System.out.println(result);
		}
	}
}

