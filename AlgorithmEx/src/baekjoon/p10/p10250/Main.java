package baekjoon.p10.p10250;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] x = new int [t];
		int[] y = new int [t];

		String result = "";

		for (int i = 0; i < t; i++) {
			int room = 1;
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			int n = scanner.nextInt();
			outter: for (int p = 1; p <= w; p++) {
				for (int k = 1; k <= h; k++) {
					if (room == n) {
						x[i] = p;
						y[i] = k;
						break outter;
					} else {
						room++;
					}
				}
			}			
		}
		for(int i=0; i<t; i++) {
			if (x[i] < 10) {
				result = y[i] + "0" + x[i];
			} else {
				result = String.valueOf(y[i]) + x[i];
			}
			System.out.println(result);
		}
		
	}
}
