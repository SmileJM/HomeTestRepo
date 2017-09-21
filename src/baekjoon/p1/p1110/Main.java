package baekjoon.p1.p1110;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int temp = n;
		int newNum = 0;
		int first = 0;
		int second = 0;
		int count = 0;

		while (n != newNum) {
			first = temp % 10;
			second = (temp / 10 + temp % 10) % 10;
			newNum = first * 10 + second;			
			temp = newNum;
			count++;
		}
		System.out.println(count);
	}
}