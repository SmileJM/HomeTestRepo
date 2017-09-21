package baekjoon.p4.p4344;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		double[] rate = new double[testCase];
		DecimalFormat format = new DecimalFormat("#.000%");
		for (int i = 0; i < testCase; i++) {
			int stu = scanner.nextInt();
			int[] scores = new int[stu];
			int sum = 0;
			for (int k = 0; k < stu; k++) {
				scores[k] = scanner.nextInt();
				sum += scores[k];
			}			
			double avg = (double)sum/stu;
			int aboveAvg = 0;
			for (int k = 0; k < stu; k++) {
				if(scores[k]>avg) {
					aboveAvg++;
				}
			}
			rate[i] = (double)aboveAvg/stu;
		}
		
		for (int i = 0; i < testCase; i++) {
			System.out.println(format.format(rate[i]));
		}
	}
}
