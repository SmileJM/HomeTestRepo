package baekjoon.p10.p10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;
/*
 * 스택 구현
 * 
 * 입력
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
 * 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 
 * 출력
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
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