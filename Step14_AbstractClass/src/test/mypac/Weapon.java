package test.mypac;
/*
 *  [ 추상클래스 (Abstract Class) ]
 *  
 *  - class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 *  - 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할수 있다.
 *  - 형태만 정의된 메소드를 만들때는 abstract 예약어를 붙어서 메소드를 정의한다.
 *  - 생성자는 존재하지만 단독으로 객체 생성은 불가하다
 *  	*new Weapon()은 안된다는겨, 반드시 자식클래스를 만들어서 객체 생성해야함
 *  - 추상클래스 Type 의 id 가 필요하다면 추상클래스를 상속받은 자식클래스를 
 *    정의해서 객체 생성한다.
 *  - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 
 *    오버라이드(재정의) 해야한다. 
 */
//추상 메소드를 포함하고 있는 클래스는 abstract 예약어를 붙인다.
public abstract class Weapon {
	//메소드 정의
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	//미완성(추상)메소드는 abstract 예약어를 붙여서 만들어야 한다
	public void attack() {
		System.out.println("나나나");
	};

}
