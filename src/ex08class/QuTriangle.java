package ex08class;
//get:값을 반환 set: 값을 설정

class Triangle{
	//멤버변수
	int bottom;//밑변
	int height;//높이
	
	
	//밑변과 높이를 초기화하는 멤버베소드
	public void init(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	//삼각형의 널이를 구하는 멤버메소드
	public double getArea() {
		return bottom*height*0.5;
	}
	// 밑변을 설정
	public void setBottom(int bot) {
		bottom = bot;
	}
	// 높이를 설정
	public void setHeight(int hei) {
		height=hei;
	}
		
}


public class QuTriangle {

	
	
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}


}
