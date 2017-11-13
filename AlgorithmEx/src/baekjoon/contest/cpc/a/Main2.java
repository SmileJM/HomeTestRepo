package baekjoon.contest.cpc.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			long n = Long.parseLong(br.readLine());
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
