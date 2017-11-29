package test.mypac;
/*
 *  [ Thread (작업단위) 만들기 ]
 *  
 *  (방법1)
 *  
 *  1. Thread 클래스를 상속받은 클래스를 정의한다.
 *  2. run() 메소드를 오버라이딩한다.
 *  3. 새로운 작업단위가 필요한 시점에 클래스를 이용해서 객체를 생성하고
 *     start() 라는 메소드를 호출하면 스레드가 시작된다. 
 *     new AnotherThread.start();
 */
public class AnotherThread extends Thread{
	//run() 메소드 재정의
	@Override
	public void run() {
		//새로운 작업단위(스레드)가 시작되는 run() 메소드
		System.out.println("또다른 스레드가 시작.");
		for(int i=0; i<10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("또다른 스레드가 종료.");
	}
}
