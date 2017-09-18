package kakao.p5;

import java.util.ArrayList;

class Solution {
	public int solution(String str1, String str2) {
		int answer = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		ArrayList<String> list1 = new ArrayList<>();
		for(int i=0; i<str1.length()-1; i++) {
			String str = str1.substring(i, i+2);
			if(str.matches("[a-z][a-z]")) {
				list1.add(str);
			}		
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		for(int i=0; i<str2.length()-1; i++) {
			String str = str2.substring(i, i+2);
			if(str.matches("[a-z][a-z]")) {
				list2.add(str);
			}		
		}
		int intersection = 0;
		
		for(int i=0; i<list1.size(); i++) {
			for(int k=0; k<list2.size(); k++) {
				if(list1.get(i).equals(list2.get(k))) {
					list2.set(k, "0");					
					intersection++;
					break ;
				}
			}
		}
		
		int union = list1.size() + list2.size() - intersection;
		
		double result = 0;
		if(list1.size() == 0 && list2.size()==0) {
			result = 1;
		} else {
			 result = (double)intersection/union;
		}
		answer = (int)(result*65536);
		System.out.println(answer);				
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String str1 = "E=M*C^2";
		String str2 = "e=m*c^2";
		solution.solution(str1, str2);
		System.out.println();
	}
}
