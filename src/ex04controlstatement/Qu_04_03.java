package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

//	문제3) 파일명 : Qu_04_03.java
//	국어, 영어, 수학 점수를 사용자로부터 입력받아서	평균을 구해  
//	90점이상 A학점, 
//		80점이상 B학점,
//		....
//		60점미만 F학점을 출력하는 프로그램을 작성하시오.
//	단 switch문을 사용해야 합니다.(Scanner클래스를 사용하세요)

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg, avg1;
		
		System.out.print("국어:");
		kor = scanner.nextInt();
		System.out.print("영어:");			
		eng = scanner.nextInt();
		System.out.print("수학:");
		math = scanner.nextInt();
			
		avg1 = (kor+eng+math)/3;
		avg = (kor+eng+math)/(3 * 10);
		System.out.println("평균점수:"+avg1);
			
		switch(avg) {
		case 10: case 9:
			System.out.println("학점:A"); break;
		case 8:
			System.out.println("학점:B"); break;
		case 7:
			System.out.println("학점:C"); break;
		case 6:
			System.out.println("학점:D"); break;
		default:
			System.out.println("학점:F");
		}
	}

}
