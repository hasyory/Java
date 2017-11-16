package test.mypac;

public class Computer {
	/*
	 * 	[ 필드 정의하기 ]
	 * 
	 *  1. 접근지정자 ?
	 *  	public : 어디서든 접근 가능(전체공개), default 접근지정자(아무것도 입력하지 않았을 경우) 같은 패키지 안에서만 접근가능
	 *  2. static or non static ?
	 *  3. Data Type? 
	 *  4. 필드 name ?
	 *  5. 초기값 ?
	 *  
	 */
	
	// 필드에 출고 날짜를 담고 싶다.
	public String productionDate = null; // camelcase로 자주 사용, 초기값은 필요없지만 공간을 만들어줘야하므로 null값으로 초기화  
	// 필드에 Cpu객체의 참조값을 담고 싶다.
	public Cpu cpu = null;
	
	// 생성자(Constructor) : 객체를 생성할 때 호출되는 부분, 객체가 생성되는 시점에 초기화 작업이 필요할때 사용.
	// 생성자를 입력하지 않으면 비어있는 디폴트 생성자를 호출한다.
	// 클래스명과 같고 리턴해주는 타입이 명시X
	public Computer() {
		System.out.println("Computer() 호출됨");
	}
	
	/*
	 *	[ Method(기능) 정의하기 ]
	 *
	 * 	1. 접근 지정자 ?
	 *  2. static or non static ?
	 *  3. 리턴 데이터 Type?
	 *  4. Method name?
	 *  5. Method에 전달받는 인자의 갯수와 Data Type?
	 *  
	 */
	public void doGame() {
		System.out.println("게임을 해요!");
	}
	
}
