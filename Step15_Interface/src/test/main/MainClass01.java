package test.main;

import test.mypac.MyRemocon;
import test.mypac.YourRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		useRemocon(new YourRemocon());
	
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
