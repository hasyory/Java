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
	
	/*	
	 * 	[ Constructor(생성자) 정의하기 ]
	 * 
	 * 	1. 접근지정자 ?
	 * 	2. 생성자에 전달받는 인자의 갯수와 Data type ?
	 * 	3. 생성자를 몇개 정의할지 ? 
	 * 	=> 생성자는 여러개 정의할 수 있음(Overloading), 클래스를 설계하는 시점에 용도에 따라 다양한 생성자를 제공해주기 위해
	 *  
	 */
	
	// 생성자(Constructor) : 객체를 생성할 때 호출되는 부분, 객체가 생성되는 시점에 초기화 작업이 필요할때 사용.
	// 생성자를 입력하지 않으면 비어있는 디폴트 생성자를 호출한다.
	// 클래스명과 같고 리턴해주는 타입이 명시X (method가 아니기 때문)
	public Computer() {
		System.out.println("Computer() 호출됨"); 
		// system도 class라고 볼 수 있다 -> out이라는 static 필드가 있음, printstream타입의 참조값이 들어가 있음
	}
	
	// 인자로 String type을 전달받는 생성자
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) 호출됨");
		// 생성자의 인자로 전달된 값을 멤버필드에 저장하기
		this.productionDate = productionDate;
	}
	
	// 인자로 Cpu type을 전달받는 생성자
	public Computer(Cpu cpu) {
		this.cpu = cpu;
	}
	
	// 인자로 String type과 Cpu type을 전달받는 생성자
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate = productionDate;
		this.cpu = cpu;
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
