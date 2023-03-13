package hello;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[];
		intArray =  new int[5];
		int max = 0;
		int min = 0;
		int sum = 0;
		
		System.out.println("intArray [ "+0+" ] = ");
		intArray[0] = scanner.nextInt();
		min = max = sum = intArray[0];
		
		for(int i=1;i<intArray.length;i++) {
			System.out.println("intArray [ "+i+" ] = ");
			intArray[i] = scanner.nextInt();
			if(max < intArray[i]) {
				max = intArray[i];
			}
			if(min > intArray[i]) {
				min = intArray[i];
			}
			sum += intArray[i];
		}
		System.out.println("최대값 : " + max + " 최소값 : " + min + " 합계 : " + sum +" 평균 : "+ (double)sum/intArray.length );
		
		scanner.close();
	}
}
