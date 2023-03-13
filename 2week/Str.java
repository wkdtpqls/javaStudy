package hello;

public class Str {
	public static void main(String[] args) {
		final double PI = 3.14; //상수로 선언 이 변수는 수정할 수 없다는 의미를 가짐
		double radius = 10.2;
		double circleArea = radius * radius * PI;
		
		System.out.print("반지름 : " + radius + ", ");
		System.out.println("원의 넓이 = " + circleArea);
	}
}
