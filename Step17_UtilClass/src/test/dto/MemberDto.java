package test.dto;

/*
 *  Data Transfer Object 의 약자 : Dto
 */
public class MemberDto {
	//멤버 필드 정의하기
	//객체 안에서만 접근 가능 private
	private int num;
	private String name,addr;
	//생성자
	public MemberDto() {}
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
