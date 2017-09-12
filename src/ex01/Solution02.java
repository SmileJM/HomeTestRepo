package ex01;

public class Solution02 {
	public boolean solution(int[] arr) {
		boolean answer = true;
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr.length || arr2[arr[i]-1] != 0) {
				answer = false;
                break;
			}

			arr2[arr[i]-1] = arr[i];
		}
		return answer;
	}
}
