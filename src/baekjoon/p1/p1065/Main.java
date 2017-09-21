package baekjoon.p1.p1065;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void method(int n) {
		int eq = 0;
		List<Integer> list = new ArrayList<>();
		while(n>0) {
			list.add(n%10);
			n/=10;
		}
		for(int i=0; i<list.size(); i++) {
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
	}
}
