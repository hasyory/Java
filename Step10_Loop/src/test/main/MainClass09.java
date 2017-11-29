package test.main;

import test.dto.*;

public class MainClass09 {
	public static void main (String[] args) {
		System.out.println("메인 시작");
		System.out.println("---------------");
		
		/*
		 * 	MemberDto 객체를 담을 수 있는 방 3개 짜리 배열 객체를
		 * 	생성해서 3명의 회원 정보를 각각 저장해 보슈
		 */
		
		MemberDto[] membs=new MemberDto[3];
		membs[0]=new MemberDto(1,"야옹이","숲");
		membs[1]=new MemberDto(2,"멍멍이","개집");
		membs[2]=new MemberDto(3,"카나리아","새장");
		
		for(MemberDto tmp:membs) {
			MainClass09.showInfo(tmp);
			System.out.println("###############");
		}
		
		System.out.println("---------------");
		System.out.println("메인 종료");
	}
	public static void showInfo(MemberDto dto) {
		System.out.println("번호: "+dto.getNum());
		System.out.println("이름: "+dto.getName());
		System.out.println("주소: "+dto.getAddr());
	}
}
