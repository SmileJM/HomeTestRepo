package ex01;

public class Solution03 {
	public int[] solution(int[][] v) {
		int[] answer = new int[2];

		for (int i = 0; i < v[0].length; i++) {
			if (v[0][i] == v[1][i]) {
				answer[i] = v[2][i];
			} else if (v[0][i] == v[2][i]) {
				answer[i] = v[1][i];
			} else {
				answer[i] = v[0][i];
			}
		}
		return answer;
	}
}
