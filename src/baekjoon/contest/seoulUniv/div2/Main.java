package baekjoon.contest.seoulUniv.div2;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][2];
		int[][] temp = new int[1][2];
		int count=0;
		if(n==3) {
			for(int i=0; i<3; i++) {
				for(int k=0; k<2; k++) {
					arr[i][k] = scanner.nextInt();
				}
				temp[0][0] = Math.min(arr[i][0], arr[i][1]);
				temp[0][1] = Math.max(arr[i][0], arr[i][1]);
				
				arr[i][0] = temp[0][0];
				arr[i][1] = temp[0][1];
				
				if(arr[i][0] == 1) {
					if(arr[i][1] == 3 || arr[i][1] == 4 ) {
						count++;
					}
				}else if(arr[i][0] == 3 && arr[i][1] == 4) {
					count++;
				}
			}	
		}
			
		if(count==3) {
			System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
		} else {
			System.out.println("Woof-meow-tweet-squeek");
		}
	}
}
