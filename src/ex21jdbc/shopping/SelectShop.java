package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl {
	
	public SelectShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		
		try {
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("찾는 상품:");
			String gname = scanner.nextLine();
			
			String query = " SELECT g_idx, goods_name, "
					+" TRIM(to_char(goods_price, '999,999,000')),"
					+" TO_CHAR(regidate, 'yyyy-mm-dd hh24:mi:ss')," 
					+" p_code "
					
					+" FROM sh_goods WHERE goods_name LIKE '%"+gname+"%'";
			
			stmt = con.createStatement();
			
			rs= stmt.executeQuery(query);
			
			while(rs.next()) {
				String g_idx = rs.getString(1);
				String g_name = rs.getString(2);
				String g_price = rs.getString(3);
				/*
				 오라클의 date타입을 getDate()로 추출하면 0000-00-00 형태로 출력된다.
				 이 경우 date형 자료가 되기 때문에 java.sql.Date 클래스의 참조변수로 저장해야 한다.
				 */
				String regidate = rs.getString(4);
				
				String p_code = rs.getString(5);
				
				/*
				 오라클의 date타입을 getString()으로 추출하면 0000-00-00 00:00:00 형탸로 시간까지 출력할 수 있다.
				 만약 문자열을 잘라서 출력하고 싶다면 substring()을 사용한다.
				 */
				
				System.out.printf("일련번호:%s, 상품명:%s, 가격:%s, 등록일:%s, 제품코드:%s\n",
						g_idx, g_name, g_price, regidate, p_code);
			}
			
		} 
		catch (SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		
		finally {
			close(); //DB 자원반납
		}
	}

	public static void main(String[] args) {
		new SelectShop().execute();
	}
}
