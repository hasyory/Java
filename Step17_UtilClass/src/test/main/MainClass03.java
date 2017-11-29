package test.main;

import java.util.List;
import java.util.ArrayList;

public class MainClass03 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("나");
		names.add("너");
		names.add("우리");
		
		//List의 방의 갯수만큼 반복문 돌면서
		System.out.println("----일반 for문 사용----");
		for(int i=0; i<names.size(); i++) {
			String tmp = names.get(i);
			System.out.println(tmp);
		}
		System.out.println("----확장 for문 사용----");
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
