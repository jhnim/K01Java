package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.callable.InsertProcCall;
import ex21jdbc.connect.IConnectImpl;

/*
JAVA에서 프로시저 호출하기

1] 프로시저를 실행하기 위한 callableStatement 객체 생성
- 프로시저 호출시에는 {call 프로시저명(?,?.....?)}
- 파라미터는 in, out 순서없이 작성이 가능함.즉 프로시저 정의에 따라 달라지게 됨.
*/
public class UpdateShop extends IConnectImpl {

	public UpdateShop() {
		super("kosmo", "1234");
	}
			
	@Override
	public void execute() {
		try {
		
			/*
			 프로시저는 return값이 없으므로 함수처럼 ?= 로 시작하지 않는다.
			 out파라미터를 통해 값을 반환받게 된다.
			 */
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			//in파라미터 
			//설정 상품명, 가격, 제품코드, 수정할 상품의 일련번호
			csmt.setString(1, scanValue("상품명"));
			csmt.setString(2, scanValue("가격"));
			csmt.setString(3, scanValue("제품코드"));
			csmt.setString(4, scanValue("수정할상품의일련번호"));
			
			//out파라미터 설정. 반환값의 자료형을 설정함.
			csmt.registerOutParameter(5, Types.NUMERIC);
			csmt.execute();
			
			// out파라미터의 할당된 값을 읽어서 결과를 출력
			int affected = csmt.getInt(5);
			if(affected==0)
				System.out.println("오류발생:입력실패");
			else
				System.out.println(affected+"행 입력성공");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
			
	public static void main(String[] args) {
		new UpdateShop().execute();
	}
}
