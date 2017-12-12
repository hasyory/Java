package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass02 {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		Connection conn=null;
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url="jdbc:oracle:thin:@localhost:1521:xe";

			conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공!");
		}catch(Exception e){
			e.printStackTrace();
		}
		int num=9;
		String name="아름이";
		String addr="공대";
		
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		try {
			String sql="insert into member (num,name,addr)"+"values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.executeUpdate();
			
			System.out.println("회원정보를 저장했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}
