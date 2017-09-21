package baekjoon.p1.p1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = 1;
		int y = 1;
		boolean direction = false;

		for (int i = 1; i <= n; i++) {
			if (i == 1) {

			} else if (x == 1 && y == 1) {
				x++;
				direction = true;
			} else if (direction) {
				if (x == 1) {
					direction = false;
					y++;
				} else {
					x--;
					y++;
				}
			} else if (!direction) {
				if (y == 1) {
					direction = true;
					x++;
				} else {
					x++;
					y--;
				}
			}
		}
		System.out.println(y + "/" + x);
	}
}
