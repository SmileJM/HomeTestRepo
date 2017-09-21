package baekjoon.p2.p2908;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[2];
		
		for(int i=0; i<2; i++) {
			arr[i] = scanner.nextInt();
			arr[i] = arr[i]%10*100 + (arr[i]/10)%10*10 + (arr[i]/100)%10;	
		}		
		
		int result = 0;
		result = (arr[0]>arr[1] ? arr[0] : arr[1]) ;
		System.out.println(result);
	}
}
