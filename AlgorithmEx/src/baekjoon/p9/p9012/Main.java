package baekjoon.p9.p9012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;
/*
 * ��ȣ ���ڿ��� ����� ���������� YES, �ùٸ��� ������ NO�� ���
 * ex)  
 * ((()())) �� YES, ))(( �� NO ���
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
				String str = arrStr[i].substring(k, k+1); // i��° �׽�Ʈ���̽��� ��ȣ���ڸ� �ϳ��� ���� 
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