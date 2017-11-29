package test.main;

import test.mypac.Remocon;

public class MainClass05 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				System.out.println("올려요");
			}
			
			@Override
			public void down() {
				System.out.println("내려요");
			}
		};
		useRemocon(r1);
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("반올림");
			}
			
			@Override
			public void down() {
				System.out.println("반내림");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
