package ex05method;
//문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
//원의 반지름을 파라메타(매개변수)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
//
//메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
//-넓이공식 : 3.14 * 반지름 * 반지름
//-둘레공식 : 2 * 3.14 * 반지름
//
//실행결과]
//원의 둘레(5.5) : 34.54
//원의 넓이(5.5) : 94.985

/*
 파라매타 : 매개변수
 */

import java.util.Scanner;

public class QuCircleCalculator {

	
		
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 반지름:");
		double a = scanner.nextDouble();
		
		// 원의 둘레를 구하는 함수는 반환값이 있으므로 값을 입력받아 출력함.
		circleRound(a);
		
		
		//원의 넓이를 구하는 함수는 반환값이 없어 함수 내에서 즉시 결과출력됨.
		circleArea(a);
		// 반환값이 없는 형태: System.out.printnl("원의둘레:"+ circleArea(a));
	}

	//원의둘레(반환값이 있는 형태)
	public static double circleRound(double r) {
		
		final double PI = 3.14;
		double round = 2 * PI * r;
		System.out.println("원의 둘레("+r+"):"+ round);
		
		return round;
	}
	
	//원의 넓이(반환값이 없는 형태)
	/*
		static void circleArea(double r) {
		double area = 3.14 * r * r;
		System.out.printf("원의 넓이("+r+"):"+ area);
		}
		
		호출:
	 */
	public static double circleArea(double r) {
		
		final double PI = 3.14;
		double area = PI * r * r;
		System.out.printf("원의 넓이("+r+"):"+ area);
		
		return area;
	}
	

}

