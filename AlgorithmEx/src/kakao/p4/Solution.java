package kakao.p4;

import java.util.TreeSet;

class Solution {
	public String solution(int n, int t, int m, String[] timetable) {
		String answer = "";
		TreeSet<String> set = new TreeSet<>();
		for(int i=0; i<timetable.length; i++) {
			set.add(timetable[i]);
		}
		set.descendingSet();
		int ii = 0;
		for(String s : set) {			
			timetable[ii] = s;
			ii++;
		}
		
		
		int index = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int k = 0; k < m; k++) {				
				int go = 900 + (i * t / 60) * 100 + i*t% 60;	
				if (index<timetable.length && Integer.parseInt(timetable[index].replaceAll(":", "")) <= go) {
					count++;
					index++;
				}
				if (i == n - 1 && k == m - 1 && m!=count) {
					if(go < 1000) {
						answer = "0"+go;
					}else {
						answer = String.valueOf(go);
					}
					answer = (Integer.parseInt(answer)/100 < 10? "0"+Integer.parseInt(answer)/100 : Integer.parseInt(answer)/100) +":"+ 
					(Integer.parseInt(answer)%100 <10 ? "0"+Integer.parseInt(answer)%100  : Integer.parseInt(answer)%100 );
					System.out.println(answer);
				}
			}		
		}		

		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int n = 2;
		int t = 10;
		int m = 5;
		String[] timetable = { "09:10", "09:09", "08:00" };

		solution.solution(n, t, m, timetable);
		System.out.println();
	}
}
