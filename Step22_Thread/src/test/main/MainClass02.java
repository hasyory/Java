package test.main;

import test.mypac.*;
/*
 *  [ Thread 작업단위 만들기 ]
 *  
 *  (방법2) 더 많이 쓰인다네여
 *  
 *  - Runnable 인터페이스를 구현한 클래스를 정의한다.
 *  - run() 메소드를 오버라이드 한다.
 *  - 스레드가 필요한 곳에서 지금만든 클래스로 Runnable Type 객체를 생성한다.
 *  - Thread 객체를 생성하면서 생성자의 인자로 Runnable Type id 를 전달한다.
 *  - 생성한 Thread 객체의 start() 메소드를 호출해서 새로운 스레드를 시작 시킨다. 
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		MyThread thr1=new MyThread();
		new Thread(thr1).start();
		
		System.out.println("메인 종료");
	}
}
