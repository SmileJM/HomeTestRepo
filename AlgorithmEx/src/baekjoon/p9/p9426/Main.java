package baekjoon.p9.p9426;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		long sum = 0;

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			list1.add(Integer.parseInt(scanner.nextLine()));
		}
		
		for (int i = 0; i < n - k + 1; i++) {	
			if(i==0) {
				for (int m = 0; m < k; m++) {
					list2.add(list1.get(m));
				}
			} else {
				list2.remove(list1.get(i-1));
				list2.add(list1.get(k+i-1));
			}
			Collections.sort(list2);
			
			sum += list2.get((k + 1) / 2 - 1);			
		}		

		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		out.print(sum);
		out.flush();
		out.close();
	}
}
