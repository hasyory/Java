package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass04 {
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

		String addr="종로";
		
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		try {
			String sql="update member set addr=? where num=1";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.executeUpdate();
			
			System.out.println("회원정보를 수정 했습니다.");
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
