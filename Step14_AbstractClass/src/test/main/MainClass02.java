package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		//추상 클래스 Type 지역 변수 만들기
		Weapon w1=null;
		//추상클래스 Type의 참조값이 필요 하다면?
		//w1=new Weapon(); 이것도 안돼! 추상 클래스는 바로 생성이 안됨
		w1=new MyWeapon();
		
		
		doSomething(w1);
		//Null point exception 발생!! 
	}
	//추상 클래스 Type의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
