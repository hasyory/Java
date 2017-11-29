package test.auto;

public class Sedan extends Car {
	//부모의 메소드가 맘에 안들어! 그래서 바꾸고 싶어!
	
	@Override //재정의를 오버라이드라고 하고, 표시해줌
	public void drive() {
			System.out.println("부드럽게 부릉부릉");
	}
}
