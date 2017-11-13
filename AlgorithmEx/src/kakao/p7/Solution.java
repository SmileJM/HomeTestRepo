package kakao.p7;

class Solution {
	public int solution(String[] lines) {
		int answer = 0;
		int h = 24;
		int m = 60;
		int s = 60;
		int ms = 1000;

		int count = 0;

		for (int k = 0; k < lines.length; k++) {
			double max = Double.parseDouble(lines[k].substring(11, 23).replaceAll("[:]", ""));
			double t = Double.parseDouble(lines[k].substring(24).replaceAll("[s]", ""));
			double min = max - t;
			System.out.println(max);
			System.out.println(min);

		}
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] lines = { "2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s" };
		solution.solution(lines);
		System.out.println();
	}
}
