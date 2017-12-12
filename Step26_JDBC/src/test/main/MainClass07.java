package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		/*
		 * member 테이블에 있는 모든 내용을
		 * ListMemberDto 형태로 담아보세요.
		 */
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> ListMemberDto = new ArrayList<>();
		
		String qrStr="SELECT num,name,addr FROM member";
		
		try {
			pstmt = conn.prepareStatement(qrStr);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				ListMemberDto.add(new MemberDto(num,name,addr));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//try
		
		System.out.println("메인 종료");
	}
}
