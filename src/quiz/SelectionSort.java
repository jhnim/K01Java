package quiz;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		
Random random = new Random();
		
		int[] arr = new int[10];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = random.nextInt(100);
			for(int j=0 ; j<i ; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}

		System.out.println("중복되지 않는 난수");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				int temp;
				if(j!=i) {
					if(arr[0]>arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		System.out.println("선택정렬 후");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("정렬과정");
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(i!=j) {
					
					int temp;
					if(arr[i]<arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("선택정렬 후2");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
