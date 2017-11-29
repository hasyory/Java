package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		
		//SmartPhone 객체를 생성해서 참조값을 SmartPhone type 으로 받기
		SmartPhone p1=new SmartPhone();
		//p1에 들어 있는 참조값을 HandPhone type 변수에 담기
		HandPhone p2=p1;
		//p2에 들어 있는 참조값을 Phone type 변수에 담기
		Phone p3=p2;
		//p3에 들어 있는 참조값을 Object type 변수에 담기
		Object p4=p3;
		
		if(p1==p3) {
			System.out.println("같다!");
		}
		
		//p4에 들어있는 참조 값을 Phone type으로 casting
		Phone p5 = (Phone)p4;
		p5.Call();
		//p4에 들어있는 참조 값을 HandPhone type으로 casting
		HandPhone p6=(HandPhone)p4;
		p6.mobileCall();
		//p4에 들어있는 참조 값을 SmartPhone type으로 casting
		SmartPhone p7=(SmartPhone)p4;
		p7.doInternet();
		
	}
}
