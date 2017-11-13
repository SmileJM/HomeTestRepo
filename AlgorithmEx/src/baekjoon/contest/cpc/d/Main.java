package baekjoon.contest.cpc.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	private static int[] changeScores = new int[100001];
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private void Solution(int t) throws NumberFormatException, IOException {
		double[] scores = new double[t];
		for (int i = 0; i < t; i++) {
			scores[i] = Double.parseDouble(br.readLine());
			changeScores[(int) (scores[i] * 1000)]++;
		}
		int count = 7;
		DecimalFormat format = new DecimalFormat("0.000");
		for (int i = 0; i < changeScores.length; i++) {
			if (changeScores[i] > 0) {
				for (int k = 0; k < changeScores[i]; k++) {
					System.out.println(format.format(i / 1000.0));
					count--;
					if (count == 0) {
						return;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main m = new Main();
		int t = Integer.parseInt(br.readLine());
		m.Solution(t);		
		br.close();
	}
}
