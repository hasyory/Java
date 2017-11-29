package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		MainClass04.showSum(10, 20); 
		
		// 같은 클래스의 멤버이므로 클래스명 생략 가능!
		showSum(20, 30);
	}
	
	public static void showSum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum : " + sum);
	}
	
	/*
	 * 메소드 명 : showSum
	 * 전달받는 인자의 갯수 : 2개
	 * 전달받은 인자의 데이터 type : 2개 모두 int type
	 * 메소드 내에서의 동작 : 전달받은 2개의 정수의 합을 출력 
	 */
}
