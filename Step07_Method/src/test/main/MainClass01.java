package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		//MyUtil 클래스에 정의한 public static void showVersion() 메소드 호출
		MyUtil.showVersion();
		//MyUtil 클래스에 정의한 public void sendMessage() 메소드 호출
		
		MyUtil u=new MyUtil();
		u.sendMessage();
		
		MyUtil u2=new MyUtil();
		u2.sendMessage();
	}
}
