package test.mypac;

/*
 * 	[Interface]
 * 	-생성자가 없다(단독 객체 생성불가)
 * 	-구현된 멤버 메소드는 가질 수 없다 (추상 메소드만 가질 수 있다)
 * 	-멤버 필드는 static final 멤버 필드만 가질 수 있다.
 * 	-data type의 역활을 할 수 있다.
 * 	-인터페이스 type의 참조값이 필요하면 구현(implements) 클래스를 만들어서 객체를 생성해야 한다.
 */
public interface Remocon {
	//필드 정의하기
	//접근 방법 Remocon.VERSION
	public static final int VERSION=1;
	public String COMPANY="LG";
	//static final이 기본이기 때문에 명시하지 않아도 기본적으로 static final로 정의됨.
	
	//메소드 정의하기
	public abstract void up();
	public void down();
}
