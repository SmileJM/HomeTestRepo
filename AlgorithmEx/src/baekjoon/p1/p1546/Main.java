package baekjoon.p1.p1546;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		int[] arr = new int[a];
		double max = 0;
		for(int i=0; i<a; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		double sum = 0;
		
		for(int i=0; i<a; i++) {
			sum += arr[i] / max * 100;
		}	
		
		DecimalFormat format = new DecimalFormat("#.00");
		String avg = format.format(sum/a);
		System.out.println(avg);			
	}
}