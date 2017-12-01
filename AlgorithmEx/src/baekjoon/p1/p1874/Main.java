package baekjoon.p1.p1874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;
/*
 * �Է� 
 * ù �ٿ� n(1��n��100,000)�� �־�����. 
 * ��° �ٺ��� n���� �ٿ��� ������ �̷�� 1�̻� n������ ������ �ϳ��� ������� �־�����. 
 * ���� ���� ������ �� �� ������ ���� ����.
 * 
 * ���
 * �Էµ� ������ ����� ���� �ʿ��� ������ �� �ٿ� �� ���� ����Ѵ�. 
 * push������ +��, pop ������ -�� ǥ���ϵ��� �Ѵ�. 
 * �Ұ����� ��� NO�� ����Ѵ�.
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
		int k = 1;	// ���ؿ� push �� ��ȣ
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