package hello;

public class ArrayEx {
	static int addEele(int[] intArr) {
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		return sum;
	}
	
	static int[] setArr(int[] arr) { //1차원배열 return
		int[] temp = arr;
		for (int i = 0; i < temp.length; i++) {
			temp[i] += 10;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] arrOne = {1,2,3,4,5};
		int[] arrTwo = {10,20,30};
		
		System.out.println(addEele(arrOne));
		System.out.println(addEele(arrTwo));
		
		int[] arrThree = setArr(arrTwo);		
		for (int i = 0; i < arrThree.length; i++) {
			System.out.println(arrTwo[i]);
		}
	}
}
