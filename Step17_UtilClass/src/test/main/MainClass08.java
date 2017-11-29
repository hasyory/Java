package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		/*
		 * 	javascript 에서의 {} 와 유사하게
		 * 	데이터를 관리하는 type
		 * 		HashMap
		 */
		// String == Key generic , Object == Value generic
		// 모든 타입을 받으려고 Object로 지정함
		Map<String, Object> map1 = new HashMap<>();
		//javascript의 object 형태 {num:1, name:"권하경", isMan: false}와 동일
		map1.put("num", 1);
		map1.put("name", "권하경");
		map1.put("isMan", false);
		
		int a = (int)map1.get("num");
		String b = (String)map1.get("name");
		boolean c = (boolean)map1.get("isMan");
		
		System.out.println("메인 종료");
		
	}
}
