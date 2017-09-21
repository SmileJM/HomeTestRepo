package baekjoon.p1.p1316;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] arr = new String[n];
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextLine();			
		}		
		
		for(int i=0; i<arr.length; i++) {
			String str = "";
			
			outter:for(int k=0; k<arr[i].length(); k++) {
				str = arr[i].substring(k, k+1);
				boolean result = false;
				for(int m=k+1; m<arr[i].length(); m++) {
					if(!str.equals(arr[i].substring(m, m+1))) {
						result = true;
					}else if(result && str.equals(arr[i].substring(m, m+1))) {						
						break outter;
					}
				}				
			}
			System.out.println(i);
			count++;
		}
		System.out.println(count);		
	}
}
