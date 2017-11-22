package baekjoon.p4.p4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
/* 
 * �Է�
 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. 
 * �� ���̽��� n�� �����ϸ�, �� �ٷ� �̷���� �ִ�. (n �� 123456)
 * �Է��� ���������� 0�� �־�����.
 * 
 * ���
 * �� �׽�Ʈ ���̽��� ���ؼ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.
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
