package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class MainClass09 {
	public static void main(String[] args) {
		Map<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "권하경");
		map1.put("isMan", false);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "김현우");
		map2.put("isMan", true);
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "이향림");
		map3.put("isMan", false);
		
		// 3명의 정보를 각각 담고 있는 HashMap 객체를
		// ArrayList 객체에 누적 시켜 보세요.
		
		List<Map<String, Object>> maps = new ArrayList<>();
		maps.add(map1);
		maps.add(map2);
		maps.add(map3);
		
		/*
		 * List<Map<String, Object>> 타입을 전달 받는
		 * static 멤버 메소드를 만들어 보세요
		 * 메소드형: printMembers
		 */
		printMembers(maps);
	}
	public static void printMembers(List<Map<String, Object>> arg) {
		/*
		 * 인자로 전달받은 arg에 잇는 참조값을 이용해
		 * 회원정보를 아래와 같은 형식으로 출력해보세요
		 * 번호: 1, 이름: 권하경, 주소: 사당 , 나는 boolean 젠더로함 
		 */
		for(Map<String, Object> tmp:arg) {
			int a = (int)tmp.get("num");
			String b = (String)tmp.get("name");
			String c = (boolean)tmp.get("isMan")? "남자":"여자";
			System.out.println("번호: "+a+", 이름: "+b+", 성별: "+c);
		}//for		
	}//printMembers
}
