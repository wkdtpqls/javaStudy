package hello;

public class foreachEx {
	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int i: intArray) {		
			System.out.println(i);
			sum += i;
		}
		String strArray[] = {"Apple","Banana","Cherry","Delmont"};
		for(String s: strArray) {
			System.out.println(s);
		}
	}
}
