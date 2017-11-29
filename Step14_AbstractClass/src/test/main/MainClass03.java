package test.main;

import test.mypac.*;

public class MainClass03 {
	//inner class
	public static class OurWeapon extends Weapon{
		
		@Override
		public void attack() {
			System.out.println("반장몬을 공격!");
		}
	}
	
	public static void main(String[] args) {
		//추상 클래스 Type 지역 변수 만들기
		Weapon w1=null;
		
		//static 메소드 안에서는 static 요소만 참조할 수 있음
		w1 = new OurWeapon();
		doSomething(w1);
	}
	//추상 클래스 Type의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
