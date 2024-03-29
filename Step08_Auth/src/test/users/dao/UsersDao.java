package test.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.users.dto.UsersDto;
import test.util.DBcpBean;

public class UsersDao {
	private static UsersDao dao;
	
	private UsersDao() {}
	
	public static UsersDao getInstance() {
		if(dao==null) {
			dao = new UsersDao();
		}
		return dao;
	}
	//아이디 비밀번호가 유효한지 여부를 리턴하는 메소드
	public boolean isValid(UsersDto dto){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//아이디와 비밀번호가 맞는 정보인지 여부 
		boolean isValid=false;
		try {
			conn = new DBcpBean().getConn();
			String sql = "SELECT * FROM users"
					+ " WHERE id=? AND pwd=?";
			pstmt = conn.prepareStatement(sql);
			//? 에 아이디와 비밀번호를 바인딩하고 
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			//SELECT 해서 
			rs = pstmt.executeQuery();
			while (rs.next()) {//row 가 하나라도 있으면 
				isValid=true; //유효한 정보이다. 
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//아이디 비밀번호가 유효한 정보인지 여부를 리턴해준다.
		return isValid;
	}//isValid()
	
	public boolean insert(UsersDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isSuccess=false;
		try{
			conn=new DBcpBean().getConn();
			String sql="INSERT INTO users "
					+ "(id,pwd,email,regdate) "
				+ "VALUES(?,?,?,SYSDATE)";
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getEmail());

			int flag=pstmt.executeUpdate();
			if(flag>0){
				isSuccess=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close(); 
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		return isSuccess;
	}
	
	public UsersDto getData(String id) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		UsersDto dto=null;
		try{
			conn=new DBcpBean().getConn();
			String sql="SELECT pwd,email,TO_CHAR(regdate,'YYYY/MM/DD HH24:MI') as regdate FROM users WHERE id=?";
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, id);

			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new UsersDto();
				dto.setId(id);
				dto.setPwd(rs.getString("pwd"));
				dto.setEmail(rs.getString("email"));
				dto.setDate(rs.getString("regdate"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close(); 
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		return dto;
	}
	
	public boolean update(UsersDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isSuccess=false;
		try{
			conn=new DBcpBean().getConn();
			String sql="UPDATE users SET "
					+ "pwd=?,email=? "
				+ "WHERE id=?";
			pstmt=conn.prepareStatement(sql);

			pstmt.setString(1, dto.getPwd());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getId());

			int flag=pstmt.executeUpdate();
			if(flag>0){
				isSuccess=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close(); 
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		return isSuccess;
	}
	public boolean delete(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try {
			conn = new DBcpBean().getConn();
			String sql = "DELETE FROM users WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			int flag = pstmt.executeUpdate();
			if (flag > 0) {
				isSuccess = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return isSuccess;
	}
}
