package test.main;

import test.mypac.MyRemocon;
import test.mypac.YourRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		//Remocon 인터페이스 type을 담을 지역변수 만들기
		Remocon r1=null;
		//Remocon 타입의 참조값이 필요하다면?
		//r1=new Remocon(); 안돼! 인터페이스는 생성자가 없서!
		// => 구현 클래스를 만들어야해!
		r1=new MyRemocon();
		useRemocon(r1);
		
		Remocon r2=new YourRemocon();
		useRemocon(r2);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
