package baekjoon.p9.p9012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;
/*
 * 괄호 문자열이 제대로 닫혀있으면 YES, 올바르지 않으면 NO를 출력
 * ex)  
 * ((()())) 는 YES, ))(( 는 NO 출력
 */
public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {		
		int n = Integer.parseInt(br.readLine());
		String[] arrStr = new String[n];
		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<n; i++) {
			arrStr[i] = br.readLine();
		}				
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		outter:for(int i=0; i<n; i++) {
			for(int k=0; k<arrStr[i].length(); k++) {
				String str = arrStr[i].substring(k, k+1); // i번째 테스트케이스의 괄호문자를 하나씩 추출 
				if(stack.empty() && str.equals(")")){
					out.println("NO");
					stack = new Stack<>();
					continue outter;
				} else if(str.equals("(")){
					stack.push("ps");
				} else if(str.equals(")")){
					stack.pop();
				}				
			}
			if(stack.empty()) {
				out.println("YES");
			} else {
				out.println("NO");
			}
			stack = new Stack<>();
		}
		out.flush();
		out.close();
	}
}