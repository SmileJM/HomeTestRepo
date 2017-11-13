package baekjoon.p1.p1157;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toUpperCase();
		int[] arr = new int[26];
		for(int i=0; i<str.length(); i++) {
			int n = (int)str.charAt(i)-65;
			arr[n]++;
		}
		
		int max = 0;
		int index = 0;
		int equal = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				equal++;
			}else if(arr[i] > max) {				
				max = arr[i];
				index = i;
				equal = 0;
			}
		}
		
		if(equal == 0) {
			System.out.println((char)(index+65));
		}else {
			System.out.println("?");
		}
	}
}
