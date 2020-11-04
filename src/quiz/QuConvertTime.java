package quiz;

import java.util.Scanner;

public class QuConvertTime {

	static final int HOUR = 60*60;
	static final int MIN = 60;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		int second = scanner.nextInt();

		convertSecToHMS(second);
	}

	public static void convertSecToHMS(int sec) {
		
		// 시, 분, 초를 저장하기 위한 지역변수선언
		int h, m, s;
		// 시간구하기
		h= sec / HOUR;
		sec = sec % HOUR; //시간을 구하고 남은 초를 다시 저장
		
		//분 구하기
		m = sec / MIN;
		sec = sec % MIN; // 분을 구하도 남은 초를 다시 저장
		
		//초 구하기
		s = sec;
		
		System.out.printf("%d시간 %d분 %d초", h, m, s);
	}
	
}
