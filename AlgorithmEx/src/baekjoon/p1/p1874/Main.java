package baekjoon.p1.p1874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;
/*
 * 입력 
 * 첫 줄에 n(1≤n≤100,000)이 주어진다. 
 * 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 
 * 물론 같은 정수가 두 번 나오는 일은 없다.
 * 
 * 출력
 * 입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. 
 * push연산은 +로, pop 연산은 -로 표현하도록 한다. 
 * 불가능한 경우 NO를 출력한다.
 * 
 */
public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {		
		int n = Integer.parseInt(br.readLine());		
		int[] arr = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
						
		Stack<Integer> stack = new Stack<>();
		int k = 1;	// 스텍에 push 할 번호
		int i = 0;
		
		StringBuilder sb = new StringBuilder();		
		stack.push(k);
		sb.append("+\n");
		k++;		
		
		while(!stack.empty() || k<=n) {			
			if(k <= arr[i]) {
				stack.push(k);
				sb.append("+\n");
				k++;								
			} else if(stack.lastElement() == arr[i]) {
				stack.pop();
				sb.append("-\n");
				i++;				
			} else {
				sb = new StringBuilder();
				sb.append("NO");
				break;
			}
		}
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		out.println(sb.toString());
		out.flush();
		out.close();
	}
}