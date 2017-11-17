package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		Computer com1 = new Computer();
		
		Computer com2 = new Computer("2017.11.16");
		
		// Cpu type을 전달받는 생성자를 이용해서 Computer객체를 생성하고 참조값을 com3이라는 변수에 담아보세요.
		Computer com3 = new Computer(new Cpu()); // Cpu cpu = new Cpu()가 말이 되는지 생각해보자
		
		/* 풀어서 쓸 수도 있음
		* Cpu cpu = new Cpu();
		* Computer com4 = new Computer(cpu);
		*/
		
		// String type과 Cpu type을 모두 전달받는 생성자를 이용해서 Computer객체를 생성하고 참조값을 com4라는 변수에 담아보세요.
		Computer com4 = new Computer("2017.11.16", new Cpu());
		
		
		
	}
}
