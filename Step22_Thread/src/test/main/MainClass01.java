package test.main;
//작업의 단위 == Thread

import test.mypac.*;
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		new AnotherThread().start();
		//.start() 해당 스레드의 run()메소드를 콜함
		//객체 생성후   객체.run() 으로 호출하면 해당 메소드가 종료되고 나서 
		//실행이 됨. 싱글 스레드 처럼.. 구러니까 스레드 형태로 실행하기위해 .start()사용
		new AnotherThread().start();

		doSomething();
		
		System.out.println("메인 종료");
	}
	public static void doSomething(){
		System.out.println("메인 스레드가 5초 일시정지됨");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("doSomething() 리턴");
	}
}
