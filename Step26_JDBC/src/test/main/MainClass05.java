package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import test.util.*;

public class MainClass05 {
	public static void main(String[] args) {
		//getConn() 메소드를 통해 객체의 참조값을 얻어옴
		Connection conn=new DBConnect().getConn();
		
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
