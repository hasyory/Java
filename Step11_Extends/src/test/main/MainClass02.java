package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		//자식 객체는 부모 클래스 타입으로 받을 수 있다.
		//유지보수가 편해진다?		
		//변수의 타입을 정의하는 것은 변수에 대한 사용 설명서 역활
		//SmartPhone 객체의 참조값을 다양한 type 변수에 담을 수 있다. 다형성.
		//캐스팅 하여 Object타입인 p1를 SmartPhone타입으로 변경하여 쓸 수도 있음. 

		Object p1=new SmartPhone();
		Phone p2=new SmartPhone();
		HandPhone p3=new SmartPhone();
		SmartPhone p4=new SmartPhone();
	}
}
