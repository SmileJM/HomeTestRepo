package baekjoon.p2.p2920;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[8];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int asc = 0;
		int desc = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == i+1) {
				asc++;
			}else if(arr[i] == 8-i) {
				desc++;
			}
		}
		
		if(asc==8) {
			System.out.println("ascending");
		}else if(desc==8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}		
	}
}
