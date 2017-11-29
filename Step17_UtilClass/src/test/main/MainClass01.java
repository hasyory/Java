package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> msgs=new ArrayList<String>(); //가변 배열 객체
		msgs.add("하나");
		msgs.add("둘");
		msgs.add("셋");
		//가변 배열 객체는 기본 데이터 타입을 담을 수 없음
		//아무거나 다 담고 싶음? 그럼 Object 타입
		//int 타입이 받고싶으면 Integer
		ArrayList<Integer> nums=new ArrayList<Integer>();
		//정수int 데이터를 넣더라도 Integer로 wrapping되어서 들어감
		nums.add(10);
		nums.add(20);
		nums.add(30);
	}
}
