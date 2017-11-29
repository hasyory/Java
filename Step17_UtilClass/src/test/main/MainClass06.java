package test.main;

import java.util.ArrayList;
import java.util.List;
import test.dto.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		String[] names=new String[3];
		
		names[0]="김구라";
		names[1]="나나나";
		names[2]="마마무";
		
		String a = names[2];
		int namesLen = names.length;
		//방의 삭제는 불가하지만 비울 수 있음
		names[0]=null;
		
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("김구라");
		names2.add("나나나");
		names2.add("마마무");
		
		String b = names2.get(1);
		int names2Len = names2.size();
		//방 삭제, 엄밀히 말하면 List 인터페이스를 위해 만들어진 기능?
		names2.remove(2);
		
		//아래 추가한 printNames() 메소드를 호출
		//MainClass06.printNames(names);
		printNames(names);
		printFriends(names2);
	}
	/*
	 * String[] type 을 인자로 전달 받는 static 멤버 메소드
	 * 를 만들어보세요.
	 * 접근지정자 :public
	 * 리턴 타입 : void
	 * 메소드명: printNames
	 * 메소드에 전달되는 인자를 받을 변수명: names
	 */
	public static void printNames(String[] arg) {
		//반복문 돌면서 배열에 있는 모든 문자열을
		//출력하시오
		for(String tmp:arg) {
			System.out.println(tmp);
		}
	} 
	/*
	 * List<String> type 을 인자로 전달 받는 static 멤버 메소드
	 * 를 만들어보세요.
	 * 접근지정자 :public
	 * 리턴 타입 : void
	 * 메소드명: printFriends
	 * 메소드에 전달되는 인자를 받을 변수명: arg
	 */
	public static void printFriends(List<String> arg) {
		for(String tmp:arg) {
			System.out.println(tmp);
		}
	}
	
}
