package test.main;

import test.mypac.*;

public class MainClass06 {
	public static void main(String[] args) {
		// Pen 객체를 생성해서 write() 메소드를 호출해 보슈!
		Pen pen1=new Pen("하늘");
		
		Pen pen1Clone = pen1.write();
		//같은 객체 참조값  return this여서
		pen1Clone.draw().write().draw().write();
	}
}
