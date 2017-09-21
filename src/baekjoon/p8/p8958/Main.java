package baekjoon.p8.p8958;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] strArr = new String[n]; 
		int[] scores = new int[n];
		
		for(int i=0; i<n; i++) {
			strArr[i] = scanner.nextLine();
		}		
		
		for(int i=0; i<n; i++) {
			int score = 0;
			for(int k=0; k<strArr[i].length(); k++) {				
				if(strArr[i].substring(k, k+1).equals("O")) {
					score++;
				}else {
					score = 0;
				}
				scores[i]+=score;
			}
			System.out.println(scores[i]);
		}		
	}
}
