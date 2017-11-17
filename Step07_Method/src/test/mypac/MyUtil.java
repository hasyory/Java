package test.mypac;
/*
 * [ 메소드 정의하기 ]
 * 1. 접근지정자
 * 2. static or non static
 * 3. return 데이터 type
 * 4. 메소드 명
 * 5. 메소드에 전달받는 인자의 갯수와 데이터 type
 */
public class MyUtil {
	//메소드 정의하기
	public static void showVersion(){
		System.out.println("showVersion() 호출됨.");
	}
	public void sendMessage() {
		System.out.println("sendMessage() 호출됨.");
	}
	public static int getNum() {
		System.out.println("getNum() 호출됨.");
		return 10;
	}
	public static String getMessage() {
		System.out.println("getMessage() 호출됨.");
		return "Hello?";
	}
	public String getName() {
		System.out.println("sendName() 호출됨.");
		return "HK";
	}
	/*
	 * 접근 지정자: public
	 * static
	 * 리턴 데이터 type : Car
	 * 메소드명 : getCar
	 * 인자: 없음
	 */
	public static Car getCar() {
		System.out.println("getCar() 호출됨.");
		return new Car();
	}
	//인자로 String type을 받는 메소드
	public static void printMsg(String msg) {
		System.out.println("printMsg() 호출됨.");
		System.out.println("전달받은 메시지: \""+msg+"\"");
	}
	// 인자로 Car type을 받는 메소드
	public static void useCar(Car car) {
		car.drive();
	}
	// 인자로  String type 과 Car type을 전달 받는 메소드
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}