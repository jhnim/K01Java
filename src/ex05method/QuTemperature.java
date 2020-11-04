package ex05method;
//문제5-3) 파일명 : QuTemperature.java  (난이도:중)
//섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
//
//공식]
//화씨 = 1.8 * 섭씨 + 32
//섭씨 = (화씨 - 32) / 1.8

import java.util.Scanner;

public class QuTemperature {


	public static void main(String[] args) {
	
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨:");
		double c = scanner.nextDouble(); 
		System.out.print("화씨");
		double f = scanner.nextDouble();
		
		celsius(f);
		fahrenheit(c);
	}

	// 섭씨 -> 화씨
	static double celsius(double f) {
	
		double c = 1.8 * f + 32;
		return(c);
	}
	
	
	//화씨 -> 섭씨
	static double fahrenheit(double f) {
		
		
		// return (c - 32) / 1.8;
		double c = (f - 32) / 1.8;
		return(f);
	}
}
