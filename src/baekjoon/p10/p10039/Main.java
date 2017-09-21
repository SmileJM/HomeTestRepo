package baekjoon.p10.p10039;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i]<40) {
				arr[i]=40;
			}
			sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.println(avg);		
	}
}
