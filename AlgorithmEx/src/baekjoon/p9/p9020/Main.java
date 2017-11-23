package baekjoon.p9.p9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
/*
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. 
 * (4 ≤ n ≤ 10,000)
 * 
 * 출력
 * 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다.
 * 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
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
