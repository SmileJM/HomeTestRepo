package baekjoon.p4.p4673;

import java.util.Scanner;

public class Main {
	public static int[] arr = new int[10000];
	public static int max = 10000;

	public static void method(int n) {
		int newNum = n;
		while (n > 0) {
			newNum += n % 10;
			n /= 10;
			if(newNum>max) {
				return;
			}
		}
		if(arr[newNum-1]==1) {
			return;
		}
		arr[newNum - 1] = 1;		
		method(newNum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= max; i++) {
			if (arr[i - 1] == 0) {
				method(i);
				System.out.println(i);
			}
		}
	}
}
