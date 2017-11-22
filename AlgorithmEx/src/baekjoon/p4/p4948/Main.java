package baekjoon.p4.p4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
/* 
 * 입력
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
 * 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
 * 입력의 마지막에는 0이 주어진다.
 * 
 * 출력
 * 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
 */
public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {		
		int n = -1;		
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

		while(0 != (n=Integer.parseInt(br.readLine())) ) {
			int count = 0;	
			
			for(int i=n+1; i<=2*n; i++) {
				boolean result = true;
				
				for(int k=2; k<=Math.sqrt(i); k++) {
					if(i%k==0) {
						result = false;
						break;
					}
				}
				if(result) {
					count++;	
				}
			}
			bf.write(count+"\n");						
		}		
		bf.flush();
		bf.close();
	}
}
