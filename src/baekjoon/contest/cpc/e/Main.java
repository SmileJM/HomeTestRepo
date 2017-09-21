package baekjoon.contest.cpc.e;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int c = scanner.nextInt();
			int k = scanner.nextInt();
			sum += c * k;
		}
		System.out.println(sum);
	}
}
