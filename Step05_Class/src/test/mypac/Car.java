package test.mypac;

public class Car {
	// 일반 멤버 필드 정의하기
	public String name = "소나타";
	
	// 일반 멤버 메소드 정의하기
	public void drive() {
		
		Car a = this; // this를 사용하여 이런 문법도 성립
		
		System.out.println("달려요");
	}
	
	// 일반 멤버 메소드 정의하기
	public void showInfo() {
		System.out.println("차의 이름 : " + this.name); // this. 을 생략할 수도 있음
	}
	// this : 같은 객체 안에서 나의 참조값을 가르키는 명렁어
	// 
}
