package baekjoon.p9.p9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
/*
 * �Է�
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����. 
 * (4 �� n �� 10,000)
 * 
 * ���
 * �� �׽�Ʈ ���̽��� ���ؼ� �־��� n�� ������ ��Ƽ���� ����Ѵ�.
 * ����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�, �������� �����Ѵ�.
 */
public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {		
		int t = Integer.parseInt(br.readLine());
		
		int[] arr = new int[t];
		
		boolean[] primeArr = new boolean[10001];				
		primeArr[1] = primeArr[2] = true;
		
		for(int i=2; i<primeArr.length; i++) {
			boolean result = true;
			for(int m=2; m<=Math.sqrt(i); m++) {
				if((i)%m == 0) {
					result = false;
					break;
				}
			}
			if(result) {
				primeArr[i] = true;
			}
		}
		
		for(int i=0; i<t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for(int i=0; i<t; i++) {
			int n = arr[i]/2;
			for(int k=0; k<n; k++) {				
				if(primeArr[n-k] && primeArr[n+k]) {
					out.println((n-k) + " " + (n+k));					
					break;
				}
			}					
		}
		out.flush();
		out.close();
	}
}
