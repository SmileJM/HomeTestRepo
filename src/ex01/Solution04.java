package ex01;

public class Solution04 {
	public int solution(int[][] board) {
		int answer = 1234;
		int x = board.length;
		int y = board[0].length;
		int maxleng = 0;
		if (x > y) {
			maxleng = y;
		} else {
			maxleng = x;
		}
		int[] count = new int[board[0].length];
		while (maxleng > 1) {
			for (int i = 0; i < x; i++) {
				for (int k = 0; k < y; k++) {
					if (board[i][k] == 1) {
						count[i]++;
					}
				}
				System.out.println((i + 1) + ":" + count[i]);
				System.out.println(maxleng);
				if (count[i] < maxleng) {
					count[i]=0;
					maxleng--;
					break;
				}

			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution04 solution = new Solution04();
		solution.solution(new int[][] { { 1, 1, 1, 1 }, { 1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 1, 1, 0, 0 } });
	}
}
