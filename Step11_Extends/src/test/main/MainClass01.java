package test.main;

import test.mypac.*;

/*
 * 	[extends 상속]
 * 	1. 클래스를 상속받는 문법 학습	extends 부모클래스명
 * 	2. 상속받은 클래스를 이용해서 객체 생성했을 때 참조값을 
 * 		받아 줄 수 잇는 다양한 type 학습	부모 Type = 자식 객체
 * 	3. 형변환(Casting) 연산자의 활용	(Casting)값
 * 	4. 자식 생성자에서 부모 생성자에 값을 전달하는 방법	super(값)
 * 	5. 메소드 오버라이딩(재정의)하는 방법	@Override
 * 	6. 오버라이딩한 메소드에서 부모객체의 메소드를 호출하는 방법 super.메소드()
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		Phone p1=new Phone();
		p1.Call();
		
		System.out.println("=================");
		//상속 받은 클래스를 부모 클래스라고 함
		HandPhone p2=new HandPhone();
		p2.Call();
		p2.mobileCall();
		p2.takePicture();

		System.out.println("메인 종료");
		/*
		 *	Phone객체( 부모) 가 먼저 만들어지고, HandPhone객체가 만들어짐
		 *	그루핑 그리고 하나의 참조값으로 관리가됨
		 *	자식 클래스에서 부모를 가르키는 것이 super()
		 */
	}
}
