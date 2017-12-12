package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		Connection conn=null;
		try{
			//오라클 드라이버 로딩하기
			//oracle.jdbc.drive 까지가 패키지명 .OracleDriver가 클래스
			//ext폴더에 있는걸 가져다 쓰는 거래
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 oracle DB url 정보
			//자바에서 Oracle DB에 접속하려면 해당 참조값이 필요하다고 함
			//jdbc:oracle:thin은 사용하는 JDBC드라이버가 thin 타입을 의미
			//XE는 Oracle database client의 고유한 service name
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공!");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//실행할 sql 문 준비
			String sql="select num, name, addr from member";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//ResultSet 객체의 참조값 얻어오기
			//SELECT문의 수행결과 값을 가지고 있는 객체
			rs=pstmt.executeQuery();
			//반복문 돌면서 cursor를 한칸씩 내림
			while(rs.next()) {
				//현재 cursor가 위치한 곳의
				//row에서 원하는 컬럼의 데이터를 받아온다.
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"/"+name+"/"+addr);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}
