package baekjoon.p2.p2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static void mergeSort(List<Integer> list, int left, int right) {
		int mid = 0;
		if (left < right) {
			mid = (left + right) / 2;
			mergeSort(list, left, mid);
			mergeSort(list, mid + 1, right);
			merge(list, left, mid, right);
		}
	}

	private static void merge(List<Integer> list, int left, int mid, int right) {
		List<Integer> result =  new LinkedList<>();
		
		int i = 0;
		int l = left;
		int m = mid + 1;

		while (l < m && m <= right) {
			if (list.get(l) < list.get(m)){
				result.add(i++, list.get(l++));
			} else {
				result.add(i++, list.get(m++));
			}
		}
		while (l <= mid) {
			result.add(i++, list.get(l++));
		}
		while (m <= right) {
			result.add(i++, list.get(m++));
		}

		i = 0;
		while (left <= right) {
			list.set(left++, result.get(i++));		
		}
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		mergeSort(list, 0, n - 1);
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int i = 0; i < n; i++) {
			pw.println(list.get(i));
		}
		pw.flush();
		pw.close();
	}
}
