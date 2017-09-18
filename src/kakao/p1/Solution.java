package kakao.p1;

class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = "";
			for (int k = 0; k < n; k++) {
				if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
					answer[i] += " ";
				} else {
					answer[i] += "#";
				}
				arr1[i] /= 2;
				arr2[i] /= 2;
			}
			answer[i] = new StringBuffer(answer[i]).reverse().toString();		
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		solution.solution(n, arr1, arr2);
		System.out.println();
	}
}
