package baekjoon.p6.p6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
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
			int a = 1;
			int b = 1;
			int big =0;
			int small = 0;
			if(m>=n) {
				big = m;
				small = n;				
			} else {
				big = n;
				small = m;
			}
			
			boolean result = true;
			for (int k = 1; k <= m * n; k++) {
				if (a > m) {
					a = 1;
				}
				if (b > n) {
					b = 1;
				}
				
				if (x == a && y == b) {
					System.out.println(k);
					result = false;
					break;
				} else if(big%small==0 && k>big) {
					break;
				}
				a++;
				b++;
			}
			if (result) {
				System.out.println(-1);
			}
		}
	}
}