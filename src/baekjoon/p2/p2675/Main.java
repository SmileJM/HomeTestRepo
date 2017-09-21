package baekjoon.p2.p2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] strArr = new String [n];
		
		for(int i=0; i<n; i++) {
			strArr[i]="";
			int r = Integer.parseInt(scanner.next());
			String str = scanner.nextLine().trim();
			for(int k=0; k<str.length(); k++) {
				for(int m=0; m<r; m++) {
					strArr[i] += str.substring(k, k+1);	
				}				
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(strArr[i]);	
		}		
	}
}
