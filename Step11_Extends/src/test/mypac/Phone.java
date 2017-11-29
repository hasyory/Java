
package test.mypac;

public class Phone extends Object {
	// 기본 클래스 옆에는 extends Object가 자동으로 붙음
	// import 하지 않았는데 어떻게?
	// java.lang 패키지에 포함된 클래스고 해당 패키지에 있는 내용들은 기본적으로 사용되거나 사용할 수 있음.
	
	public Phone() {
		System.out.println("Phone() 기본 생성자 호출!");
	}
	
	public void Call() {
		System.out.println("전화를 겁니당");
	}
}
