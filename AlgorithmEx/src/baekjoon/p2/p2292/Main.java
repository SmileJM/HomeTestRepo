package baekjoon.p2.p2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 1;
		int sum = 1;
		
		while (true) {
			if (n <= sum) {
				System.out.println(count);
				break;
			}else {				
				sum += 6*count;
				count++;
			}
		}
	}
}
