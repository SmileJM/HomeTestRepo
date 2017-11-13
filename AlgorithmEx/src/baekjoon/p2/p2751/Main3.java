package baekjoon.p2.p2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static void mergeSort(int[] arr, int left, int right) {
		int mid = 0;
		if (left < right) {

			mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int[] result = new int[arr.length];
		int i = 0;
		int l = left;
		int m = mid + 1;

		while (l < m && m <= right) {
			if (arr[l] < arr[m]) {
				result[i++] = arr[l++];
			} else {
				result[i++] = arr[m++];
			}
		}
		while (l <= mid) {
			result[i++] = arr[l++];
		}
		while (m <= right) {
			result[i++] = arr[m++];
		}

		i = 0;
		while (left <= right) {
			arr[left++] = result[i++];
		}
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		mergeSort(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
