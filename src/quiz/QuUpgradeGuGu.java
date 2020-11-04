package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {

		for(int d=2 ; d<=9 ; d++) {
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%d*%d=&d", d, su, (d*su));
				System.out.print(" ");
			}
			System.out.println();
			d++;
		}
		
	}

}


//static int noParamYesReturn() {
//	int sum = 0;
//	for(int i=1 ; i <=10 ; i++) {
//		sum += i;
//	}
//	return sum;
//}