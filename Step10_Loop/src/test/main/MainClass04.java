package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		//Random 한 수를 얻어낼 수 있는 Random 객체 생성
		Random ran=new Random();
		
		int[] ranNums=new int[5];
		
		for(short i=0; i<ranNums.length; i++) {
			ranNums[i]=ran.nextInt(10);
			System.out.println(ranNums[i]);
		}
		
		/*
		 * int를 저장할 수 있는 방 5개 int[]객체를 생성해서
		 * 0-9 사이의 랜덤한 정수를 각각 대입해보세요.
		 */
		System.out.println("메인 종료");
	}
}
