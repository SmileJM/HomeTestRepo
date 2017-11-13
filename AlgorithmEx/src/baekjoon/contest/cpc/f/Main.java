package baekjoon.contest.cpc.f;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		long sum = 0;
		for (int i = 0; i < n; i++) {
			int c = scanner.nextInt();
			int k = scanner.nextInt();
			sum += (c * k) * ((long) Math.pow(2, k - 1) % (Math.pow(10, 9) + 7));
		}
		long result = sum%((long)Math.pow(10, 9) + 7);
		System.out.println(result);
	}
}
