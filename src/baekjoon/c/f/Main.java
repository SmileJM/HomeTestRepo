package baekjoon.c.f;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int c = scanner.nextInt();
			int k = scanner.nextInt();
			sum += c * k * (int)Math.pow(2, k-1);
		}
		int result = (int)sum%((int)Math.pow(10, 9)+7);
		System.out.print(result);
	}
}
