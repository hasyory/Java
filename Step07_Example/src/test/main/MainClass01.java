package test.main;

import java.util.Random;

public class MainClass01 {
	public static void main(String[] args) {
		// java.util 패키지에 있는 Random 클래스 import해서
		// 객체 생성후 참조값을 ran 이라는 지역변수에 담는다.
		
		
		Random ran=new Random();
		
		
		//int 범위 내 랜덤한 정수
		//int ranNum=ran.nextInt();
		
		//0~9 사이 랜덤한 정수
		//int ranNum=ran.nextInt(10);
		
		//1~45 사이 랜덤한 정수
		int ranNum=ran.nextInt(45)+1;
		
		System.out.println(ranNum);
	}
}
