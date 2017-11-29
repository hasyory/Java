package test.main;

import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		//1. Car type을 담을 수 있는 방 3개 배열 객체 생성 후 
		//	참조값을 cars라는 변수에 담기
		Car[] cars= new Car[3];
		
		//2. Car 객체를 생성하되 생성자의 인자로
		//	"소나타", "아반떼", "프라이드"를 각각 전달해서
		// 객체를 생성해서 cars 배열에 0, 1,2번방에 각각 담기
		cars[0] = new Car("소나타");
		cars[1] = new Car("아반떼");
		cars[2] = new Car("프라이드");
		
		//3. 배열에 저장된 Car 객체의 참조값을 이용해서
		// drive.메소드를 각각 호출해보슈
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		Car[] cars2= {new Car("a"),new Car("b"), new Car("c")};
		cars2[0].drive();
		cars2[1].drive();
		cars2[2].drive();
		
		Car[] a=cars;
		Car b=cars[0];
		String c=cars[0].name;
		int d=cars[0].name.length();
		
		System.out.println("메인 종료");
	}
}
