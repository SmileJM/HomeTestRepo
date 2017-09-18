package kakao.p2;

class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		int i = 0;
		int temp = 0;

		for (int k = 0; k < 3; k++) {
			int score = 0;
			String bonus = "";
			String option = "";
			if (dartResult.substring(i, i + 2).matches("\\d{2}")) {
				score = 10;
				i++;
			} else {
				score = Integer.parseInt(dartResult.substring(i, i + 1));
			}
			i++;

			bonus = dartResult.substring(i, i + 1);
			i++;
			if (i < dartResult.length()) {
				if (dartResult.substring(i, i + 1).matches("[#*]")) {
					option = dartResult.substring(i, i + 1);
				} else {
					i--;
				}
			}
			i++;

			if (bonus.equals("D")) {
				score *= score;
			} else if (bonus.equals("T")) {
				score = score * score * score;
			}

			if (option.equals("*")) {
				score *= 2;
				answer += score + temp;
			} else if (option.equals("#")) {
				score *= -1;
				answer += score;
			} else {
				answer += score;
			}

			temp = score;
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String dartResult = "1D2S3T*";
		solution.solution(dartResult);
		System.out.println();
	}
}
