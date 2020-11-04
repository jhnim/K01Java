package quiz;

public class ExSusikAZ {

	public static void main(String[] args) {
		
		/*
		 i : 0~9사이의 정수
		 j : 0~9사이의 정수
		 단, i와 j는 서로 다른 정수이다.
		 */
		for(int i=0 ; i<=9 ; i++) {
			for(int j=0 ; j<=9 ; j++) {
				
				/*
				 i와 j는 서로다른 정수이므로 같은 값이 나올때는 아래 코드를 실행하지 않고 반복문의 처음으로 돌아간다.
				 */
				if(i==j) {
					//i와 j는 서로 다른 숫자이므로 확인필요없음
					continue;
				}
				else {
					// ij와 ji 를 코드로 표현하면 아래와 같다
					int result = ((10*i)+j)+((10*j)+i);
					if(result==99) {
						System.out.printf("%d%d + %d%d =%d\n", i,j, j,i, result);
					}
				}
			}
		}
	}

}
