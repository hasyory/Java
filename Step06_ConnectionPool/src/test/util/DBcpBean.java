package test.util;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/*
 *  Data Base Connection Pool Bean
 *  
 *  - DataBase 에 access 해서 작업하려면 Connection 객체가 필요하다.
 *  - Connection 객체를 connection pool 에 미리 만들어 놓고 필요할때 마다
 *    사용하고 반납하는 구조로 사용해야한다. 
 *  - DbcpBean 객체에서 리턴해주는 Connection 객체를 사용하고 .close() 
 *    메소드를 호출하면 자동으로 반납된다. 
 */
public class DBcpBean {
	//맴버필드
	private Connection conn;
	
	//생성자
	public DBcpBean(){
		try{
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
			System.out.println("DbcpBean 작업성공!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//Connection 객체를 리턴해주는 메소드
	public Connection getConn(){
		return conn;
	}
}