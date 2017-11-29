package test.main;

import test.dto.*;

public class MainClass08 {
	public static void main (String[] args) {
		System.out.println("메인 시작");
		System.out.println("---------------");
		MemberDto dto1=new MemberDto();
		dto1.setNum(2);
		dto1.setName("김현우");
		dto1.setAddr("의왕");
		
		MemberDto dto2=new MemberDto(1,"권하경","사당");
		
		MainClass08.showInfo(dto2);
		System.out.println("---------------");
		MainClass08.showInfo(dto1);
		
		System.out.println("---------------");
		System.out.println("메인 종료");
	}
	public static void showInfo(MemberDto dto) {
		System.out.println("번호: "+dto.getNum());
		System.out.println("이름: "+dto.getName());
		System.out.println("주소: "+dto.getAddr());
	}
}
