package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		// Computer 객체를 생성해서 com1이라는 지역변수에 담아보세요.
		Computer com1 = new Computer();	
		// com1 객체의 productionDate에 "2017년11월16일"을 대입변산자를 이용해서 대입해보세요.
		com1.productionDate = "2017년11월16일";
		// com1 객체의 doGame()메소드를 호출해 보세요.
		com1.doGame();
		
		// com1 객체의 cpu에 Cpu type 객체의 참조값을 대입연산자를 이용해서 대입해 보세요.
		com1.cpu = new Cpu();
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
