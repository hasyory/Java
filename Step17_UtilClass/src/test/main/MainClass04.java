package test.main;

import test.dto.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 	3 명의 회원정보를 각각 MemberDto 객체에 담아서
		 * 	ArrayList 객체에 참조값을 저장 
		 */
		ArrayList<MemberDto> Users= new ArrayList<MemberDto>();
		Users.add(new MemberDto(1,"하경","사당"));
		Users.add(new MemberDto(2,"에이콘","종각"));
		Users.add(new MemberDto(3,"구라","노량진"));
		
		for(MemberDto tmp:Users) {
			System.out.println(tmp.getNum()+"번째, 이름: "+tmp.getName()+", 주소: "+tmp.getAddr());
		}
	}
}
