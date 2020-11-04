package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {
		
		int kor = 99, eng = 80, math = 96;
		int result = kor+eng+math;
		
		// 국어, 영어, 수학 도 정수 , 평균을 나눌 때 3도 정수이기 때문에 실수로 만들기 위해선 3.0으로 작성해야 한다.
		
		//double avg1=(k+e+m)/3; - 정수/정수 => 정수의 결과
		//double avg2 =(k+e+m)/3.0; - 정수/실수 => 실수의 결과
		
		System.out.println("평균점수(실수형)="+ (double)result/3);
		System.out.println("평균점수(정수형)="+ result/3);

	}

}


/*
문제2] 파일명 : Qu_02_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
*/
//public class Qu_02_02 {
//
//	public static void main(String[] args) {
//		
//		int k=99, e=80, m=96;
//		int avg1 = (k+e+m) / 3;//정수 / 정수 => 정수의 결과
//		double avg2 = (k+e+m) / 3.0;//정수 / 실수 => 실수의 결과 
//		System.out.println("평균점수1:"+ avg1);
//		System.out.println("평균점수2:"+ avg2);
//	}
//}
