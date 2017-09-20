package baekjoon.c.g;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x1 = new int[n];
		int[] x2 = new int[n];
		int[] y1 = new int[n];
		int[] y2 = new int[n];
		for(int i=0; i<n; i++) {
			x1[i] = scanner.nextInt();
			y1[i] = scanner.nextInt();
			x2[i] = scanner.nextInt();
			y2[i] = scanner.nextInt();
			
		}
	}
}
