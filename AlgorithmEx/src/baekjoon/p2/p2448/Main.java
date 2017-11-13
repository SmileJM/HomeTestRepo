package baekjoon.p2.p2448;

import java.util.Scanner;

public class Main {

	public static void printStar(int n) {

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < n * 3; k++) {
				System.out.print(" ");
			}
			if (i == 0) {
				System.out.println("  *  ");
			} else if (i == 1) {
				System.out.println(" * * ");
			} else {
				System.out.print("*****");
			}
		}

	}

	public static void printFormat(int n) {
		int temp = n / 3;
		int count = 0;
		while (temp > 1) {
			temp /= 2;
			count++;
		}
		for(int i=0; i<=count; i++) {
			printStar(count);	
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// 3*Math.pow(2, 0)
		// printStar(n);
		printFormat(n);

	}
}
