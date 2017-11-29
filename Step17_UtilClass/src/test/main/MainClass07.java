package test.main;

import test.dto.MemberDto;
import java.util.List;
import java.util.ArrayList;

public class MainClass07 {
	public static void main(String[] args) {
		MemberDto dto1 = new MemberDto(1,"하경","사당");
		MemberDto dto2 = new MemberDto(2,"에이콘","종각");
		MemberDto dto3 = new MemberDto(3,"구라","노량진");
		
		MemberDto[] members = new MemberDto[3];
		members[0]=dto1;
		members[1]=dto2;
		members[2]=dto3;
		
		//members에 들어있는 참조값을 이용해 "에이콘"을 참조해서 a라는 이름으 변수에 대입
		String a = members[1].getName();
		
		//생성자의 <> 부분 생략 가능
		List<MemberDto> members2 = new ArrayList<>();
		members2.add(dto1);
		members2.add(dto2);
		members2.add(dto3);
		//members2에 들어있는 참조값을 이용해 "에이콘"을 참조해서 b라는 이름으 변수에 대입
		String b = members2.get(1).getName();
		
		System.out.println(a+" "+b);
	}
}
