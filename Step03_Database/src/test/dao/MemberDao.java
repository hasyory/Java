package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	private static MemberDao dao;
	private boolean isSuccess=false;
	private MemberDao() {}
	
	public static MemberDao getInstance() {
		if(dao==null) {
			dao = new MemberDao();
		}
		return dao;
	}
	public boolean delete(int num) {
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt= null;
		
		try {
			String sql="DELETE FROM member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			int flag=pstmt.executeUpdate();
			if(flag>0) {//작업 성공이면
				isSuccess=true;
			}
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
		return isSuccess;
	}
	public boolean insert(MemberDto dto) {
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt= null;
		
		try {
			String sql="INSERT INTO member (num,name,addr) VALUES(member_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			int flag=pstmt.executeUpdate();
			if(flag>0) {//작업 성공이면
				isSuccess=true;
			}
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
		return isSuccess;
	}
	public boolean update(MemberDto dto) {
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt= null;
		
		try {
			String sql="UPDATE member SET name=?, addr=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			int flag=pstmt.executeUpdate();
			if(flag>0) {//작업 성공이면
				isSuccess=true;
			}
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
		return isSuccess;
	}
	public List<MemberDto> getList(){
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		List<MemberDto> list=new ArrayList<>();

		try {
			String sql="SELECT num,name,addr FROM member ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				list.add(new MemberDto(num,name,addr));
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
		}
		return list;
	}
	public MemberDto getData(int num){
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		MemberDto dto =null;
		
		try {
			String sql="SELECT num,name,addr FROM member WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				int num2 = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				dto=new MemberDto(num2,name,addr);
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
		}
		return dto;
	}
}
