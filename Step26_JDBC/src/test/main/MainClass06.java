package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.*;
import test.util.*;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 번호: 999
		 * 이름: 누구게
		 * 주소: 어디게
		 * 
		 *  위의 정보를 MemberDto 객체에 담은 다음 
		 *  MemberDto 객체가 담긴 변수를 참조해서 해당 정보를 DB에 저장해 보세요
		 */
		
		MemberDto mem1=new MemberDto(999,"누구게","어디게");
		
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		
		try {
			String sql ="INSERT INTO member (num,name,addr) VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, mem1.getNum());
			pstmt.setString(2, mem1.getName());
			pstmt.setString(3, mem1.getAddr());
			
			pstmt.executeUpdate();
			System.out.println("회원 정보가 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
		}
		
	}
}
