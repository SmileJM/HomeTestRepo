package baekjoon.p9.p9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
		
		for(int i=0; i<t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for(int i=0; i<t; i++) {
			int n = arr[i]/2;
			for(int k=0; k<n; k++) {
				boolean primeResult1 = true;
				boolean primeResult2 = true;
				for(int m=2; m<=Math.sqrt(n+k); m++) {
					if((n+k)%m == 0) {
						primeResult1 = false;
						break;
					}
				}
				for(int m=2; m<=Math.sqrt(n-k); m++) {
					if((n-k)%m == 0) {
						primeResult2 = false;
						break;
					}
				}
				if(primeResult1 && primeResult2) {
					out.println((n-k) + " " + (n+k));					
					break;
				}
			}					
		}
		out.flush();
		out.close();
	}
}
