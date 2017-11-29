package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(i+1);
				Thread.sleep(1000);
				//쓰레드(작업단위, 실행순서) 5초 동안 멈추기
			}	
		} catch (InterruptedException e) {
			/*InterrupedException 은 RuntimeException을
			상속받지 않았기 때문에 반드시 tryp-catch 블럭으로
			예외 처리를 해야 문법적으로 성립된다.
			RuntimeException 이 아닌 Exception은  컴파일 시 발생하는 예외 이다
			Exception은 프로그램 작성 시 이미 예측 가능한 예외를 작성할 때 사용하고 
			RuntimeException은 발생 할수도 발생 안 할수도 있는 경우에 작성
			*/
			e.printStackTrace();
		}

		System.out.println("메인 종료");
	}
}
