package test.main;

import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		//local inner class
		class HkWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("하경몬을 공격해요");
			}
		}
		//추상 클래스 Type 지역 변수 만들기
		Weapon w1=new HkWeapon();
		doSomething(w1);
	}
	//추상 클래스 Type의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
