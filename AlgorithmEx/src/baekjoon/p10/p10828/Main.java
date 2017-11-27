package baekjoon.p10.p10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;
/*
 * ���� ����
 * 
 * �Է�
 * ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. 
 * ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
 * �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����.
 * ������ �������� ���� ����� �־����� ���� ����.
 * 
 * ���
 * ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */
public class Main {
	static Stack<Integer> stack = new Stack<>();
	static int result;
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {		
		
		int n = Integer.parseInt(br.readLine());
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String[] command = str.split(" ");
			int print = 0;
			switch(command[0]) {
			case "push": push(Integer.parseInt(command[1]));
				break;
			case "pop": out.println(pop());
				break;
			case "size": out.println(stack.size());
				break;
			case "empty": 
				if(stack.empty()) {
					print = 1;
				} else {
					print = 0;
				}
				out.println(print);
				break;
			case "top": out.println(top());
				break;
			}			
		}
		out.flush();
		out.close();
	}
	private static int top() {
		if(stack.empty()) {
			result = -1;
		} else {
			result = stack.lastElement();
		}
		return result;		
	}
	private static int pop() {
		result = top();
		if(!stack.empty()) {
			stack.pop();
		}		
		return result;
	}
	private static void push(int num) {
		stack.push(num);		
	}
}
