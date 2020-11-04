package ex04controlstatement;

//문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
//파일명 : Qu_04_08.java
//
//실행결과]
//* * * * *
//* * * *
//* * *
//* *
//*

public class Qu_04_08 {

	public static void main(String[] args) {
		
		
		//*를 출력한 층수를 표현하는 상수
		final int FLOOR =5;
		/*
		 FLOOR-x+1
		 	:변수x가 증가함에 따라 점점 감소하는 y를 표현하기 위한 일반식 정의
		 */
		
		
		//세로(층) 반복
		for(int m=1 ; m<=5 ; m++){
			//가로반복
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
	
	/*
	 * 
	 */
		
		
	
	}

}



