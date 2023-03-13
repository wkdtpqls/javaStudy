package hello;

import java.util.Scanner;

public class Lozgene {
	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		System.out.println("마름모 만들기 => 줄 입력 : ");
		
		int line = scn.nextInt();

		//아래쪽 거꾸로 삼각형
		for(int i=line; i>=0; i--) {  
			for(int j=line-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j=(i*2+1);j>=1;j--) {
				System.out.print("*");
			}			
			System.out.println();				
		}
		//위쪽 삼각형	
		for(int i=0; i<=line; i++) {
			for(int j=0; j<= line-i; j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(i*2+1);j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		scn.close();
	}
}
