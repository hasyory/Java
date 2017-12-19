package test.users.dto;

public class UsersDto {
	private	String id;
	private String pwd;
	private String email;
	private String date;
	
	public UsersDto() {}
	
	public UsersDto(String id, String pwd, String email, String date) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
