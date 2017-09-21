package baekjoon.contest.cpc.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			boolean flag = false;
			int sum = 0;
			while (n > 0) {
				if (flag) {
					int temp = (int)(n % 10) * 2;
					if (temp >= 10) {
						temp = temp % 10 + temp / 10;
					}
					sum += temp;
					flag = false; 
				} else {
					sum += n % 10;
					flag = true;
				}
				n /= 10;
			}
			if( sum %10 == 0) {
				System.out.println("T");
			}else {
				System.out.println("F");
			}
		}
	}
}
