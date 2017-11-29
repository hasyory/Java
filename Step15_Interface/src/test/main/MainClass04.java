package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		//익명의 local inner class를 이용해 객체를 생성하고
		//참조값을 Remocon type 변수에 담기
		
		Remocon r1=new Remocon()//익명클래스의 생성자 
		{
			//class ? implements Remocon 익명 클래스
			@Override
			public void up() {
				System.out.println("머리를 올려요");
			}
			@Override
			public void down() {
				System.out.println("머리를 내려요");
			}
		}; //이 전체는 Remocon을 구현한 익명클래스의 참조값이 반환됨
		
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
