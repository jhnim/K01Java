package ex05method;

//문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
//두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
//파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
//
//메소드명 : arithmetic()
//
//실행결과]
//덧셈결과 -> 177
//뺄셈결과 -> 23
//곱셈결과 -> 7700
//나눗셈 몫 -> 1
//나눗셈 나머지 -> 23

import java.util.Scanner;

public class QuSimpleOperation {

public static void arithmetic(int a, int b) {
		
		
		int sum = a + b;
		int min = a - b;
		int mul = a * b;
		int div = a / b;
		int div1 = a % b;
		
		System.out.println("덧셈결과->"+ sum);
		System.out.println("뺄셈결과->"+ min);
		System.out.println("곱셈결과->"+ mul);
		System.out.println("나눗셈 몫->"+ div);
		System.out.println("나눗셈 나머지->"+ div1);
		// printf문에서 %기호를 출력하기 위해선 이스케이프 시퀀스 [%%(2개)를] 사용함.
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요:");
		int a = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요:");
		int b = scanner.nextInt();
		
		arithmetic(a, b);
	}

}

