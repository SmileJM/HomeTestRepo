package baekjoon.p1.p1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int strSize = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		TreeSet<String> set = new TreeSet<>();

		for (int i = 0; i < strSize; i++) {
			set.add(br.readLine());
		}
		
		list.addAll(set);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}			
		});

		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		for(String s : list) {
			out.println(s);
		}
		out.flush();
		out.close();
	}
}
