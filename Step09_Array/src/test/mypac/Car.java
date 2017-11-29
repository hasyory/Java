package test.mypac;

public class Car {
	//멤버 필드
	public String name;
	
	//생성자
	public Car(String name) {
		this.name=name;
	}
	
	//멤버 메소드
	public void drive() {
		System.out.println(this.name+"가 부릉부릉");
	}
}
