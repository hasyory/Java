package test.main;
import test.mypac.*;
import test.mypac.Test.Hk;

public class MainClass01 {
	public static void main(String[] args) {
		Test t=new Test();
		Hk h=t.getHk();
		
		Hk h2=new Test().getHk();
		
		h.say();
		h2.say();
		
	}
}
