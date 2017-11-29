package test.main;

import test.mypac.Computer;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		new Computer();
		
		Computer com1 = new Computer(); // 객체를 만들때 new라는 예약어와 함께 생성자를 호출한다.
		Computer com2 = new Computer(); // 객체를 만들때 new라는 예약어와 함께 생성자를 호출한다.
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
