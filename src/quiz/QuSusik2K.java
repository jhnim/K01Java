package quiz;

import java.util.Scanner;

public class QuSusik2K {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수n을 입력하세요(0이상의 정수):");
		int n = scanner.nextInt();
		
		//변수선언과
		int k =0;
		int result = 2; //2를 거듭해서 곱할 변수
		int inc=1;
		
		if(n==0) {
			System.out.println("만족하는 k값 없음");
			return;
		}
		if(n==1) {
			System.out.println("공식을 만족하는 k값 : 0");
			return;
		}
		
		//방법1
//		while(result<=n) {
//			
//			result *=2;
//			k++;
//		}
//		System.out.println("공식을 만족하는 k값:"+ k);
		
		
		//방법2
		for(k=0; inc*2<=n ; k++) {
			inc = inc *2;
		}
		System.out.println("공식을 만족하는 k값:"+k);
		
		
	}

}