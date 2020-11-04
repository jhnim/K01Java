package ex04controlstatement;
//문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
//파일명 : Qu_04_06.java
//
//실행결과]
//*
//* *
//* * *
//* * * *
//* * * * *

public class Qu_04_06 {

	public static void main(String[] args) {
		for(int m=5 ; m>=1 ; m--){
			for(int n=1 ; n<=5 ; n++){
				if(m+n <= 6 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
