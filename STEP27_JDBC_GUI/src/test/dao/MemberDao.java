package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * Dao == Data Access Object의 약자
 * 
 * 	- 회원 정보에 대해서 Select, Insert, Update, Delete
 * 	작업을 수행할 객체를 생성하기위한 클래스 설계하기
 * 
 *	- Application 전역에서 MemberDao 객체는 오직 1개만 생성할 수 있도록 설계한다
 */
public class MemberDao {
	//1. 자신의 참조값을 담을 private static 필드 만들기
	private static MemberDao dao;
	//2. 외부에서 객체 생성할 수 없도록 생성자의 접근지정자를 private로 지정
	private MemberDao() {}
	//3. 최초에만 객체 생성 되어 리턴하도록 메소드 정의
	public static MemberDao getInstance() {
		if(dao==null) {
			dao=new MemberDao();
		}
		return dao;
	}
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private boolean isSuccess=false;
	
	//DB에 회원정보를 저장하는 메소드
	public boolean insert(MemberDto dto) {
		try {
			conn = new DBConnect().getConn();
			String sql="INSERT INTO member (num,name,addr) VALUES (member_seq.nextval,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			int flag=pstmt.executeUpdate();
			if(flag>0) {//작업 성공이면
				isSuccess=true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isSuccess;
	}
	//DB에 회원정보를 삭제하는 메소드
	public boolean delete(int num) {
		try {
			conn = new DBConnect().getConn();
			String sql="DELETE FROM member WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			int flag=pstmt.executeUpdate();
			if(flag>0) {//작업 성공이면
				isSuccess=true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isSuccess;
	}
	//DB에 회원정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		try {
			conn = new DBConnect().getConn();
			String sql="UPDATE member SET name=?, addr=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			int flag=pstmt.executeUpdate();
			if(flag>0) {//작업 성공이면
				isSuccess=true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isSuccess;
	}
	//DB의 회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList() {
		List<MemberDto> memList = new ArrayList<>();
		try {
			conn = new DBConnect().getConn();
			String sql="SELECT * FROM member ORDER BY num DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				memList.add(new MemberDto(num,name,addr));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memList;
	}
	//인자로 전달되는 번호에 해당하는 회원정보를 리턴해주는 메소드 
	public MemberDto forNum(int num) {
		MemberDto dto = null;
		try {
			conn = new DBConnect().getConn();
			String sql="SELECT * FROM member WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
			String name=rs.getString("name");
			String addr=rs.getString("addr");
			
			dto = new MemberDto(num,name,addr);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}
