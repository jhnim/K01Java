package ex06array;

import java.util.Scanner;

//문제3) 홀수/짝수 구분하여 배열채우기
//파일명 : QuFillArray.java
//길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
//그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
//
//실행결과]
//1번째 정수를 입력하세요:2
//2번째 정수를 입력하세요:4
//3번째 정수를 입력하세요:5
//4번째 정수를 입력하세요:3
//5번째 정수를 입력하세요:2
//6번째 정수를 입력하세요:9
//7번째 정수를 입력하세요:7
//8번째 정수를 입력하세요:8
//9번째 정수를 입력하세요:5
//10번째 정수를 입력하세요:1
//순서대로입력된결과
//2 4 5 3 2 9 7 8 5 1 
//홀수/짝수 구분입력결과
//5 3 9 7 5 1 8 2 4 2 


public class QuFillArray {

	public static void main(String[] args) {
		
		int[] num = new int[10];

		Scanner scanner = new Scanner(System.in);
		
		int[] arr1 = new int [10];//입력받은 정수를 순서대로 입력
		int[] arr2 = new int [10];// 홀짝 구분해서 입력

		int indexStart = 0;// arr배열의 첫번째 인덱스 저장(홀수인 경우)
		int indexEnd = arr2.length - 1; // 마지막 인덱스 저장(짝수인 경우)
		
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.print("채울 숫자를 입력하세요:");
			int inputNum = scanner.nextInt();
			
			// 첫번째 배열에는 입력한 순서대로 채워준다.
			arr1[i] = inputNum;
			
			if(inputNum%2==1) {
				//입력받은 숫자가 홀수이면 앞에서 부터 채우고 인덱스 +1 증가
				arr2[indexStart++] = inputNum;
				
			}
			else {
				// 입력받은 숫자가 짝수이면 뒤에서부터 채우고 인덱스 -1 감소
				arr1[indexStart--] = inputNum;
				
			}
		}
		
		//두개의 배열을 출력하기
		System.out.println("첫번째 배열 출력");
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n첫번째 배열 출력");
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.print(arr2[i]+" ");
		}

	}
}
	




//for(int i=0 ; i<num.length ; i++) {
//	System.out.printf("%d번째 정수를 입력하세요:", i+1);
//	int jung = scanner.nextInt();
//	num[i] = jung;
//}
//System.out.println("순서대로 입력한 결과:");
//for(int i=0 ; i<num.length ; i++) {
//	System.out.print( num[i]);
//}
//
//int[] num1 = new int[10];
//int a = num.length-1;
//int b = 0;
//for(int j=0 ; j<num1.length ; j++) {
//	
//	if(num[j]%2==0) {
//		num1[a]=num[j];
//		a--;
//	}
//	else {
//		num1[b]=num[j];
//		b++;
//	}
//}
//System.out.println();
//System.out.println("홀수/짝수 구분입력결과");
//for(int i=0 ; i<num1.length ; i++) {
//	System.out.print( num1[i]);
//
//}
	
	
	
