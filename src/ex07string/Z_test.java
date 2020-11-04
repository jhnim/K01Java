package ex07string;

public class Z_test {

	public static void main(String[] args) {

		
		String juminNum = "190419-3000000";
		if(juminNum.charAt(7) == '1' || juminNum.charAt(7)== '3') {
			System.out.println("남자입니다.");
		}
		else if(juminNum.charAt(7)== '2' || juminNum.charAt(7)== '4') {
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7)== '5' || juminNum.charAt(7)== '6') {
			System.out.println("외국인 입니다.");
		}
		else {
			System.out.println("주민번호가 잘못되었습니다.");
		}
	
		String email = "hong@ikosmo.co.kr";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("이메일 형식임");
		}
		else {
			System.out.println("이메일 형식이 아님");
		}
		
		juminNum = "120403-2012345";
		int index = juminNum.indexOf("-") +1;
		if(juminNum.charAt(index)=='3') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		String filename = "my.file.images.jpg";
		int beginIndex = filename.lastIndexOf(".")+1;
		System.out.println(filename.substring(beginIndex));
		

	
	}
	
	

}
