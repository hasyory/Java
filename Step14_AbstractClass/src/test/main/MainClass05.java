package test.main;

import test.mypac.*;

public class MainClass05 {
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
		
		// 익명의 local inner class를 이용해서 Weapon type 객체
		// 생성하여 참조값을 Weapon type 변수에 담기
		Weapon w2=new Weapon() {
			@Override
			public void attack() {
				System.out.println("아무나 공격해요");
			}
		};
		
		doSomething(w2);
	}
	//추상 클래스 Type의 참조값을 전달해야 호출할 수 있는 메소드
	public static void doSomething(Weapon w) {
		w.prepare();
		w.attack();
	}
}
