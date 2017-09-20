package baekjoon.c.d;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		double[] scores = new double[t];
		int[] changeScores = new int[100000];

		for (int i = 0; i < t; i++) {
			scores[i] = scanner.nextDouble();
			changeScores[(int) scores[i] * 1000]++;
		}
		int count = 7;
		DecimalFormat format = new DecimalFormat("#.000");
		outter: for (int i = 0; i < changeScores.length; i++) {
			if (changeScores[i] > 0) {
				for (int k = 0; k < changeScores[i]; k++) {
					System.out.println(format.format(i / 1000.0));
					count--;
					if (count == 0) {
						break outter;
					}
				}
			}
		}
	}
}
