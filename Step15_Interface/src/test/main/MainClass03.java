package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//local inner class
		class OurRemocon implements Remocon{
			@Override
			public void up() {
				System.out.println("채널 +1");
			}

			@Override
			public void down() {
				System.out.println("채널 -1");
			}
		}
		//OurRemocon 객체 생성하여 Remocon 인터페이스 타입으로 참조값 받기
		Remocon r1 = new OurRemocon();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
