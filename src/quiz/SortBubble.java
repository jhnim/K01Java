package quiz;
/*
 버블정렬(BubbleSort) : 정렬이 진행되는 과정이 거품이 보글보글 피어오르는 모습과 비슷하다 하여 지어진 명칭이다.
 정렬 알고리즘 중에서는 가장 단순하고 효율성이 떨어지는 알고리즘 이다.
 데이터가 10개인 경우 45번의 비교가 필요하다.
 */
import java.util.Random;

public class SortBubble {
	
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
					if(arr[i]<arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
		}
		
		System.out.println("오름차순 정렬");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

	

}
